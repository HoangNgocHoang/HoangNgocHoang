package Roomm;

import java.util.Scanner;

public class BedRoom extends Room {

    private int numberOfBeds;

    public BedRoom() {}

    public BedRoom(String id, String name, double baseCost, int numberOfBeds) {
        super(id, name, baseCost);
        this.numberOfBeds = numberOfBeds;
    }

    // Getter & Setter
    public int getNumberOfBeds() { return numberOfBeds; }
    public void setNumberOfBeds(int numberOfBeds) { this.numberOfBeds = numberOfBeds; }

    @Override
    public void addRoom() {
        super.addRoom();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Beds: ");
        setNumberOfBeds(sc.nextInt());
        sc.nextLine();
    }

    @Override
    public void updateRoom() {
        super.updateRoom();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter new Number of Beds (current: " + getNumberOfBeds() + "): ");
        setNumberOfBeds(sc.nextInt());
        sc.nextLine();
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Number of Beds: " + getNumberOfBeds());
        System.out.println("Total Cost: " + calculateCost());
    }

    @Override
    public double calculateCost() {
        if (numberOfBeds >= 3) {
            return getBaseCost() * 1.1;
        }
        return getBaseCost();
    }
}
