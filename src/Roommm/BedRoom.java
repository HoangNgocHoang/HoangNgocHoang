package Roommm;

import java.util.Date;
import java.util.Scanner;

public class BedRoom extends Room {

    private int numberOfBeds;

    public BedRoom() {
    }

    public BedRoom(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    public BedRoom(int numberOfBeds, String id, String name, double baseCost, Date checkin, Date checkout) {
        super(id, name, baseCost, checkin, checkout);
        this.numberOfBeds = numberOfBeds;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    @Override
    public void addRoom() {
        super.addRoom();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter NumberOfBeds ");
        setNumberOfBeds(sc.nextInt());
        sc.nextLine();
    }

    @Override
    public boolean updateRoom() {
        super.updateRoom();
        Scanner sc = new Scanner(System.in);
        System.out.println("Update NumberOfBeds :" + getNumberOfBeds());
        setNumberOfBeds(sc.nextInt());
        sc.nextLine();
        return true;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("NumberOFBeds :" + getNumberOfBeds());
        System.out.println("Cost :" + String.format("%.2f", calculateCost()));
    }

    @Override
    public double calculateCost() {
        double cost = getBaseCost();
        if (numberOfBeds >= 3) {
            cost *= 1.1;
        }
        return cost * calculateDaysOfStay();
    }

}
