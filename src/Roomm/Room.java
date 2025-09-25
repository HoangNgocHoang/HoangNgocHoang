package Roomm;
import java.util.Scanner;

public abstract class Room implements IRoom {

    private String id;
    private String name;
    private double baseCost;

    public Room() {}

    public Room(String id, String name, double baseCost) {
        this.id = id;
        this.name = name;
        this.baseCost = baseCost;
    }

    // Getter
    public String getId() { return id; }
    public String getName() { return name; }
    public double getBaseCost() { return baseCost; }

    // Setter
    public void setId(String id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setBaseCost(double baseCost) { this.baseCost = baseCost; }

    // Nhập thông tin phòng
    @Override
    public void addRoom() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Id: ");
        setId(sc.nextLine());

        System.out.print("Enter Name: ");
        setName(sc.nextLine());

        System.out.print("Enter BaseCost: ");
        setBaseCost(sc.nextDouble());
        sc.nextLine();
    }

    // Cập nhật thông tin
    @Override
    public void updateRoom() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter new Room Name (current: " + getName() + "): ");
        setName(sc.nextLine());

        System.out.print("Enter new Base Cost (current: " + getBaseCost() + "): ");
        setBaseCost(sc.nextDouble());
        sc.nextLine();
    }

    // Hiển thị thông tin
    @Override
    public void displayDetails() {
        System.out.println("Room Id: " + getId() +
                           ", Name: " + getName() +
                           ", BaseCost: " + getBaseCost());
    }

    // Trừu tượng (lớp con tự định nghĩa)
    @Override
    public abstract double calculateCost();
}
