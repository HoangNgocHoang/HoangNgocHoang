/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lec11_AccessModifier;

/**
 *
 * @author Hoang
 */
public class AccessModifier {
   int pvt = 1;
   int df = 2;
   protected int pro = 3;
   public int pbl = 4;
   public void display(){
       System.out.println(pvt);
       System.out.println(df);
       System.out.println(pro);
       System.out.println(pbl);
}
}