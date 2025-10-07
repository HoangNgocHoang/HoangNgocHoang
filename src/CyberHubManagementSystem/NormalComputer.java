
package CyberHubManagementSystem;
import java.util.Date;

public class NormalComputer extends Computer {
    private int ramSize;

    public NormalComputer(String id, String userName, String phone, double baseCost,
                          Date start, Date end, int ramSize) {
        super(id, userName, phone, baseCost, start, end);
        this.ramSize = ramSize;
    }

    @Override
    public double calculateCost() {
        double cost = getBaseCost() * calculateUsageHours();
        if (ramSize >= 16) {
            cost *= 1.1; // tăng 10% nếu RAM >= 16GB
        }
        return cost;
    }

    @Override
    public void displayDetails() {
        System.out.println("Normal Computer | ID: " + getId() + ", User: " + getUserName()
                + ", RAM: " + ramSize + "GB, Cost: " + calculateCost());
    }
}
