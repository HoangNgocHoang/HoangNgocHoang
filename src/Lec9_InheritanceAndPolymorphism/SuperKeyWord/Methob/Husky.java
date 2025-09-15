/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lec9_InheritanceAndPolymorphism.SuperKeyWord.Methob;

/**
 *
 * @author Hoang
 */
public class Husky extends Dog{
    void displayInformation(){
        super.displayPrice();
        System.out.println("Husky's price is 1500 USD  ");
        
    }
} 