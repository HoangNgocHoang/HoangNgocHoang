/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lec11_AccessModifier;

/**
 *
 * @author Hoang
 */

public class AccessModifier3 {

    public void display() {
        AccessModifier object = new AccessModifier();
        System.out.println(object.pvt);
        System.out.println(object.df);
        System.out.println(object.pro);
        System.out.println(object.pbl);
    }
}