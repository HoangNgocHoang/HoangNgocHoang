/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lec11_StaticVariable;

/**
 *
 * @author Hoang
 */
public class Person {
    private String name;
    private static int count = 0;
    public Person(String n){
        name = n;
        count++;
        System.out.println(count);
}
    public static void main(String[] args) {
        Person p1 = new Person("Trang");
        Person p2 = new Person("Danh");
        Person p3 = new Person("Hoang");
    }
}