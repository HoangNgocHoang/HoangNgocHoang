/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lec8_ObjectAndClass.ThisKeyWord;

/**
 *
 * @author Hoang
 */
public class Student {
    int id ;
    String name;
    Student(int id,String name){
        this.id = id;
        this.name = name;
}
    void display(){System.out.print(id + ""+name);}
    public static void main(String args[]){
        Student s1 = new Student(111,"Karan");
        Student s2 = new Student(321,"Aryan");
        s1.display();
        s2.display();
        
    }
}
