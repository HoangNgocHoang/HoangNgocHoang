/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lec9_InheritanceAndPolymorphism.MethodOverriding.Upcasting;
import java.util.ArrayList;
public class Processor {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Cat());
        animals.add(new Dog());
        animals.add(new Cat());
        int dogCount = 0, catCount = 0;
        for (Animal animal : animals) {
            if (animal instanceof Dog) {
                dogCount++;
            } else if (animal instanceof Cat) {
                catCount++;
            }
        }
        System.out.println("cat: " + catCount + "\ndog: " + dogCount);
    }
}