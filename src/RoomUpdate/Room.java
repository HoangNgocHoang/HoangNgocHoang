package RoomUpdate;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;
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
            System.out.println("Enter Id :");
            setId(sc.nextLine());

            System.out.println("Enter Name :");
            setName(sc.nextLine());

            System.out.println("Enter BaseCost :");
            setBaseCost(sc.nextDouble());
            sc.nextLine(); // clear buffer

            System.out.println("Enter CheckIn (dd/MM/yyyy):");
            this.checkin = sdf.parse(sc.nextLine());

            System.out.println("Enter CheckOut (dd/MM/yyyy):");
            this.checkout = sdf.parse(sc.nextLine());

            System.out.println("CheckIn: " + sdf.format(this.checkin));
            System.out.println("CheckOut: " + sdf.format(this.checkout));
        } catch (ParseException e) {
            System.out.println("Invalid date format!");
        }
    }

    @Override
    public boolean updateRoom() {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
        System.out.println("Update Name:" + getName());
        setName(sc.nextLine());
        System.out.println("Update BaseCost :" + getBaseCost());
        setBaseCost(sc.nextDouble());
        sc.nextLine();
            System.out.println("update Checkin : " +(checkin != null ? sdf.format(checkin) : "N/A" ));
            this.checkin = sdf.parse(sc.nextLine());
            System.out.println("Update checkout : " + (checkout != null ? sdf.format(checkout) : "N/A"));
            this.checkout = sdf.parse(sc.nextLine());
        return true;
        } catch (ParseException e){
            System.out.println("invalid date format");
            return false;
    }
    }

    @Override
    public void displayDetails() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Id :" + getId()
                + "Name :" + getName()
                + "BaseCost :" + getBaseCost()
                + "Check In Date :" + (checkin != null ? sdf.format(checkin) : " N/A")
                + "Check Out date :" + (checkout != null ? sdf.format(checkout) : " N/A"));

    }
    @Override
    public  abstract double calculateCost();

    public int calculateDaysOfStay() {
        if (checkin == null || checkout == null) {
            return 0;
        }
        long diff = checkout.getTime() - checkin.getTime();
        return (int) (diff / (1000 * 60 * 60 * 24));
    }
}
