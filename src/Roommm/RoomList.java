package Roommm;

import java.util.ArrayList;

public class RoomList {

    ArrayList<Room> rl = new ArrayList<>();

    public void addRoom(Room room) {
        rl.add(room);
    }

    public boolean updateRoomById(String id) {
        for (Room room : rl) {
            if (room.getId().equals(id)) {
                return room.updateRoom();
            }
        }
        return false;
    }

    public boolean deleteRoomById(String id) {
        return rl.removeIf(room -> room.getId().equals(id));
    }

    public Room findRoomById(String id) {
        for (Room room : rl) {
            if (room.getId().equals(id)) {
                return room;
            }

        }
        return null;
    }

    public Room displayAllRoom() {
        for (Room room : rl) {
            room.displayDetails();
            System.out.println("---------");
        }
        return null;
    }

    public Room findMostExpensiveRoom() {
        if (rl.isEmpty()) {
            return null;
        }
        Room maxroom = rl.get(0);
        for (Room room : rl) {
            if (room.calculateCost() > maxroom.calculateCost()) {
                maxroom = room;
            }
        }
        return maxroom;
    }

 
    public void countRoom() {
        int meetingRoom = 0, bedRoom = 0;
        for (Room room : rl) {
            if (room instanceof MeetingRoom) {
                meetingRoom++;
            } else if (room instanceof BedRoom) {
                bedRoom++;
            }
        }
        System.out.println("MeetingROom : " +meetingRoom);
        System.out.println("MeetingROom : " +bedRoom);

    }

}
