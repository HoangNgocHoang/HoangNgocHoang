package Roomm;
import java.util.Scanner;

public class MeetingRoom extends Room {

    private int capacity;

    public MeetingRoom() {}

    public MeetingRoom(String id, String name, double baseCost, int capacity) {
        super(id, name, baseCost);
        this.capacity = capacity;
    }

    // Getter & Setter
    public int getCapacity() { return capacity; }
    public void setCapacity(int capacity) { this.capacity = capacity; }

    @Override
    public void addRoom() {
        super.addRoom();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Capacity: ");
        setCapacity(sc.nextInt());
        sc.nextLine();
    }

    @Override
    public void updateRoom() {
        super.updateRoom();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter new Capacity (current: " + getCapacity() + "): ");
        setCapacity(sc.nextInt());
        sc.nextLine();
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Capacity: " + getCapacity());
        System.out.println("Total Cost: " + calculateCost());
    }

    @Override
    public double calculateCost() {
        if (capacity > 50) {
            return getBaseCost() * 1.2;
        }
        return getBaseCost();
    }
}
