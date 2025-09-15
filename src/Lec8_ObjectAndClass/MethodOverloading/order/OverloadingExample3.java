/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lec8_ObjectAndClass.MethodOverloading.order;

/**
 *
 * @author Hoang
 */
public class OverloadingExample3 {
    public static void printlnfo(String name , int age) {
        System.out.println("Name :"+ name + "age :"+ age);
    }
    public static void printlnfo(int age,String name) {
        System.out.println("age :"+ age +"Name :"+ name );
    }
    
}
