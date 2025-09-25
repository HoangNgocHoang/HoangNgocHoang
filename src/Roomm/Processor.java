package Roomm;

import java.util.Scanner;

public class Processor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RoomList rl = new RoomList();
        int choice;
        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Add a new Meeting Room");
            System.out.println("2. Add a new Bedroom");
            System.out.println("3. Update a room by ID");
            System.out.println("4. Delete a room by ID");
            System.out.println("5. Find a room by ID");
            System.out.println("6. Display all rooms");
            System.out.println("7. Find the most expensive room");
            System.out.println("8. Count rooms");
            System.out.println("0. Exit");
            System.out.print("Your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> {
                    MeetingRoom m = new MeetingRoom() {
                    };
                    m.addRoom();
                    rl.addRoom(m);
                }
                case 2 -> {
                    BedRoom b = new BedRoom() {
                    };
                    b.addRoom();
                    rl.addRoom(b);
                }
                case 3 -> {
                    System.out.println("update room");
                    String upid = sc.nextLine();
                    rl.updateRoomById(upid);
                }
                case 4 -> {
                    System.out.println("delete room");
                    String delid = sc.nextLine();
                    rl.deleteRoomById(delid);
                }
                case 5 -> {
                    System.out.println("fin a room id");
                    String fiid = sc.nextLine();
                    rl.findRoomById(fiid);
                }
                case 6 ->
                    rl.displayAllRooms();
                case 7 ->
                    rl.findMostExpensiveRoom();
                case 8 ->
                    rl.countRooms();
                case 0 -> 
                    System.out.println("exting..");                
                default -> 
                    System.out.println("invalib choice");
                
            }
        }
        while (choice != 0);
     }
}

        
       
