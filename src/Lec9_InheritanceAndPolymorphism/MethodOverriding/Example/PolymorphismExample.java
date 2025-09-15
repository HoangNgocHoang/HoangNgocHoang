/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lec9_InheritanceAndPolymorphism.MethodOverriding.Example;

/**
 *
 * @author Hoang
 */
public class PolymorphismExample {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.makeSound();
        
        Dog dog = new Dog();
        dog.makeSound();
        
        Cat cat = new Cat();
        cat.makeSound();
    }
}
