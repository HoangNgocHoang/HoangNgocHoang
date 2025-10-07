package Roommm;

import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;

public abstract class Room implements IRoom {

    private String id;
    private String name;
    private double baseCost;
    private Date checkin;
    private Date checkout;

    public Room() {
    }

    public Room(String id, String name, double baseCost, Date checkin, Date checkout) {
        this.id = id;
        this.name = name;
        this.baseCost = baseCost;
        this.checkin = checkin;
        this.checkout = checkout;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBaseCost() {
        return baseCost;
    }

    public void setBaseCost(double baseCost) {
        this.baseCost = baseCost;
    }

    public Date getCheckin() {
        return checkin;
    }

    public void setCheckin(Date checkin) {
        this.checkin = checkin;
    }

    public Date getCheckout() {
        return checkout;
    }

    public void setCheckout(Date checkout) {
        this.checkout = checkout;
    }

    @Override
    public void addRoom() {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            System.out.println("Enter id :");
            setId(sc.nextLine());
            System.out.println("Enter Name :");
            setName(sc.nextLine());
            System.out.println("Enter baseCost :");
            setBaseCost(sc.nextDouble());
            sc.nextLine();
            System.out.println("Enter check in :");
            this.checkin = sdf.parse(sc.nextLine());
            System.out.println("Enter check out :");
            this.checkout = sdf.parse(sc.nextLine());

            System.out.println("Check in :" + sdf.format(checkin));
            System.out.println("checkout :" + sdf.format(checkout));
        } catch (ParseException e) {
            System.out.println("Invalid date format ");
        }
    }

    @Override
    public boolean updateRoom() {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            System.out.println("Update Name :" + getName());
            setName(sc.nextLine());

            System.out.println("Update BaseCost :" + getBaseCost());
            setBaseCost(sc.nextDouble());
            sc.nextLine();

            System.out.println("Update Check In :" + (checkin != null ? sdf.format(checkin) : "N/A"));
            this.checkin = sdf.parse(sc.nextLine());
            System.out.println("Update Check out :" + (checkout != null ? sdf.format(checkout) : "N/A"));
            this.checkout = sdf.parse(sc.nextLine());
            return true;
        } catch (ParseException e) {
            System.out.println("Invalid Date Format ");
            return false;
        }
    }

    @Override
    public void displayDetails() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("id : " + getId());
        System.out.println("Name :" + getName());
        System.out.println("BaseCost : " + getBaseCost());
        System.out.println("CheckIn :" + (getCheckin() != null ? sdf.format(getCheckin()) : "N/A"));
        System.out.println("checkout :" + (getCheckout() != null ? sdf.format(getCheckout()) : "N/A"));
    }

    @Override
    public abstract double calculateCost();

    public int calculateDaysOfStay() {
        if (checkin == null || checkout == null) {
            return 0;
        }
        long diff = checkin.getTime() - checkout.getTime();
        return (int) (diff / (1000 * 60 * 60 * 24));
    }
}
