
package Lec8_ObjectAndClass.Ex1;

public class Car {
    private final String model;
    private final int year;

    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    public void displayDetails() {
        System.out.println("Car Model: " + model + " , Year: " + year);
    }
    
}
