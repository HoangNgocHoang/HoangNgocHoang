
package Person;

import java.util.Date;

public class Teacher extends Person {
    private int numberOfclasses;
    private double baseSalary;

    public Teacher() {
    }

    public Teacher(int numberOfclasses, double baseSalary) {
        this.numberOfclasses = numberOfclasses;
        this.baseSalary = baseSalary;
    }

    public Teacher(int numberOfclasses, double baseSalary, String id, String name, Date dateOfBirth) {
        super(id, name, dateOfBirth);
        this.numberOfclasses = numberOfclasses;
        this.baseSalary = baseSalary;
    }

    public int getNumberOfclasses() {
        return numberOfclasses;
    }

    public void setNumberOfclasses(int numberOfclasses) {
        this.numberOfclasses = numberOfclasses;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }
    @Override 
    public double calculateIncome(){
        return this.numberOfclasses*this.baseSalary;
    }
    @Override 
    public void addPerson(){
        System.out.println("Enter Teacher :" + getName() + " added");
    }
    @Override 
    public boolean updatePerson(){
        System.out.println("Update Teacher :" +getName() + "update");
        return true;
    }
    @Override
    public void displayDetails(){
        System.out.println("Number of classes :" +getNumberOfclasses() + "Base salary :" +getBaseSalary() + "Income :" + calculateIncome());
    } 
}
