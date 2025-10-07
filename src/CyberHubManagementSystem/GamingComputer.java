
package CyberHubManagementSystem;
import java.util.Date;

public class GamingComputer extends Computer {
    private String gpuType;

    public GamingComputer(String id, String userName, String phone, double baseCost,
                          Date start, Date end, String gpuType) {
        super(id, userName, phone, baseCost, start, end);
        this.gpuType = gpuType;
    }

    @Override
    public double calculateCost() {
        double cost = getBaseCost() * calculateUsageHours();
        if ("High-End".equalsIgnoreCase(gpuType)) {
            cost *= 1.2; // tăng 20% nếu máy xịn
        }
        return cost;
    }

    @Override
    public void displayDetails() {
        System.out.println("Gaming Computer | ID: " + getId() + ", User: " + getUserName()
                + ", GPU: " + gpuType + ", Cost: " + calculateCost());
    }
}
