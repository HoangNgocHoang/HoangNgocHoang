package RoomUpdate;

import java.util.Date;
import java.util.Scanner;

public class MeetingRoom extends Room {

    private int capacity;

    public MeetingRoom() {
    }

    public MeetingRoom(int capacity) {
        this.capacity = capacity;
    }

    public MeetingRoom(int capacity, String id, String name, double baseCost, Date checkin, Date checkout) {
        super(id, name, baseCost, checkin, checkout);
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public void addRoom() {
        super.addRoom();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Capacity :");
        setCapacity(sc.nextInt());
        sc.nextLine();
    }

    @Override
    public boolean updateRoom() {
        super.updateRoom();
        Scanner sc = new Scanner(System.in);
        System.out.println("Update Capacity :" + getCapacity());
        setCapacity(sc.nextInt());
        return true;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Capacity :" + getCapacity());
    }
    @Override
    public double calculateCost() {
        double cost = getBaseCost();
        if (capacity > 50) {
            cost *= 1.2;
        }
        return cost * calculateDaysOfStay();
    }
}
