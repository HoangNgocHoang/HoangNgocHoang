/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lec9_InheritanceAndPolymorphism.SuperKeyWord.Datamenber;

/**
 *
 * @author Hoang
 */
public class PolymorphismExample {
    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.makeSound();
        System.out.println("Source:" +animal.source);
    }
}
