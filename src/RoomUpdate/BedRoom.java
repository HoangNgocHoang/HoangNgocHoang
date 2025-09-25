
package RoomUpdate;
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
    public void addRoom(){
        super.addRoom();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number Of Beds :");
        setNumberOfBeds(sc.nextInt());
        sc.nextLine();
    }
    @Override 
    public boolean updateRoom(){
        super.updateRoom();
        Scanner sc = new Scanner(System.in);
        System.out.println("Update Number OF Beds :" +getNumberOfBeds());
        setNumberOfBeds(sc.nextInt());
        return true;
    }
    @Override 
    public void displayDetails(){
        super.displayDetails();
        System.out.println("NumberofBeds :" +getNumberOfBeds());
    }
    @Override
    public double calculateCost(){
        double cost = getBaseCost();
        if (numberOfBeds > 3){
            cost *= 1.1;
        }
        return cost * calculateDaysOfStay();
    }
}
