package CyberHubManagementSystem;

import java.util.Date;

public abstract class Computer implements IComputer {

    private String id;
    private String userName;
    private String phone;
    private double baseCost;
    private Date startTime;
    private Date endTime;

    public Computer() {
    }

    public Computer(String id, String userName, String phone, double baseCost, Date startTime, Date endTime) {
        this.id = id;
        this.userName = userName;
        this.phone = phone;
        this.baseCost = baseCost;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    // Getters & setters
    public String getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public String getPhone() {
        return phone;
    }

    public double getBaseCost() {
        return baseCost;
    }

    public Date getStartTime() {
        return startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setBaseCost(double baseCost) {
        this.baseCost = baseCost;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    // Tính số giờ sử dụng (làm tròn lên 1 giờ nếu dư phút)
    public int calculateUsageHours() {
        if (startTime == null || endTime == null) {
            return 0;
        }
        long diff = endTime.getTime() - startTime.getTime();
        int hours = (int) Math.ceil(diff / (1000.0 * 60 * 60));
        return Math.max(hours, 0);
    }

    @Override
    public void displayDetails() {
        System.out.println("ID: " + id + ", User: " + userName + ", Phone: " + phone);
    }

    @Override
    public void addComputer() {
    }

    @Override
    public boolean updateComputer() {
        return true;
    }

    public abstract double calculateCost();
}
