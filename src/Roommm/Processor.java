package Roommm;

import java.util.Scanner;

public class Processor {

    public static void main(String[] args) {
        RoomList rl = new RoomList();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("===== MENU =====");
            System.out.println("1. Add a new Meeting Room");
            System.out.println("2. Add a new Bedroom");
            System.out.println("3. Update a room by ID");
            System.out.println("4. Delete a room by ID");
            System.out.println("5. Find a room by ID");
            System.out.println("6. Display all rooms");
            System.out.println("7. Find the most expensive room");
            System.out.println("8. Count total rooms");
            System.out.println("9. Exit");
            System.out.print("Choose: ");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    MeetingRoom mr = new MeetingRoom();
                    mr.addRoom();
                    rl.addRoom(mr);
                    break;
                case 2:
                    BedRoom br = new BedRoom();
                    br.addRoom();
                    rl.addRoom(br);
                    break;
                case 3:
                    System.out.println("Update Room by id :");
                    String uid = sc.nextLine();
                    if (!rl.updateRoomById(uid)) {
                        System.out.println("room not found ");
                    }
                    break;
                case 4:
                    System.out.println("Delete Room By iD :");
                    String did = sc.nextLine();
                    if(!rl.deleteRoomById(did)){
                        System.out.println("rooom not found ");
                    }
                    break;
                case 5 :
                    System.out.println("find room id :");
                    String fid = sc.nextLine();
                    Room found = rl.findRoomById(fid);
                    if (found != null) found.displayDetails();
                    else System.out.println("Room not found ");
                    break;
                case 6:
                    rl.displayAllRoom();
                    break;
                case 7:
                    Room expensive = rl.findMostExpensiveRoom();
                    if (expensive != null){
                        System.out.println("most expensive room :");
                        expensive.displayDetails(); 
                    }
                    break;
                case 8 :
                    rl.countRoom();
                    break;
                case 9 :
                    System.exit(0);

            }
        }
    }
}
