package CyberHubManagementSystem;
import java.util.ArrayList;

public class ComputerList {
    private ArrayList<Computer> list = new ArrayList<>();

    public void addComputer(Computer c) { list.add(c); }

    public boolean deleteComputerById(String id) {
        return list.removeIf(c -> c.getId().equals(id));
    }

    public Computer findComputerById(String id) {
        for (Computer c : list) {
            if (c.getId().equals(id)) return c;
        }
        return null;
    }

    public ArrayList<Computer> getList() { return list; }

    public Computer findMostExpensive() {
        Computer max = null;
        double maxCost = 0;
        for (Computer c : list) {
            double cost = c.calculateCost();
            if (cost > maxCost) {
                maxCost = cost;
                max = c;
            }
        }
        return max;
    }

    public int countGaming() {
        int count = 0;
        for (Computer c : list) if (c instanceof GamingComputer) count++;
        return count;
    }

    public int countNormal() {
        int count = 0;
        for (Computer c : list) if (c instanceof NormalComputer) count++;
        return count;
    }
}
