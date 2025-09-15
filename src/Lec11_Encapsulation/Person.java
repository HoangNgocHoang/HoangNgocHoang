/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lec11_Encapsulation;

/**
 *
 * @author Hoang
 */
public class Person {
   public String name;
   private  double weight;
   public void setWeight(double weight){
       if(this.weight<0)
           System.out.println("Weight can not negative");
       else 
           this.weight = weight;
   }
}
