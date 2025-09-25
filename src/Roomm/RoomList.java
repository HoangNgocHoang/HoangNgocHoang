package Roomm;
import java.util.ArrayList;

public class RoomList {

    private ArrayList<Room> roomList = new ArrayList<>();

    public void addRoom(Room room) {
        roomList.add(room);
        System.out.println("Room added successfully!");
    }

    public boolean updateRoomById(String id) {
        for (Room r : roomList) {
            if (r.getId().equals(id)) {
                r.updateRoom();
                System.out.println("Room updated!");
                return true;
            }
        }
        System.out.println("Room not found!");
        return false;
    }

    public boolean deleteRoomById(String id) {
        for (Room r : roomList) {
            if (r.getId().equals(id)) {
                roomList.remove(r);
                System.out.println("Room deleted!");
                return true;
            }
        }
        System.out.println("Room not found!");
        return false;
    }

    public Room findRoomById(String id) {
        for (Room r : roomList) {
            if (r.getId().equals(id)) {
                r.displayDetails();
                return r;
            }
        }
        System.out.println("Room not found!");
        return null;
    }

    public void displayAllRooms() {
        if (roomList.isEmpty()) {
            System.out.println("No rooms available!");
            return;
        }
        for (Room r : roomList) {
            r.displayDetails();
            System.out.println("----------------------");
        }
    }

    public Room findMostExpensiveRoom() {
        if (roomList.isEmpty()) {
            System.out.println("No rooms available!");
            return null;
        }
        Room mostExpensive = roomList.get(0);
        for (Room r : roomList) {
            if (r.calculateCost() > mostExpensive.calculateCost()) {
                mostExpensive = r;
            }
        }
        System.out.println("Most Expensive Room: ");
        mostExpensive.displayDetails();
        return mostExpensive;
    }

    public void countRooms() {
        int meetingCount = 0, bedCount = 0;
        for (Room r : roomList) {
            if (r instanceof MeetingRoom) meetingCount++;
            else if (r instanceof BedRoom) bedCount++;
        }
        System.out.println("Total Meeting Rooms: " + meetingCount);
        System.out.println("Total Bedrooms: " + bedCount);
    }

}
