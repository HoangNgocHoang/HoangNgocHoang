/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lec9_InheritanceAndPolymorphism.MethodOverriding.Upcasting;

/**
 *
 * @author Hoang
 */
public class PolymorphismExample {
    public static void main(String[] args) {
        Animal[] animal = new Animal[3];
        animal[0] = new Dog();
        animal[1] = new Cat();
        animal[2] = new Dog();
        for (int i = 0; i < 3;i++){
            animal[i].makeSound();
    }
}
}
