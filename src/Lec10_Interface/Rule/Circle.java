/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lec10_Interface.Rule;

/**
 *
 * @author Hoang
 */
public class Circle implements IColor {
    @Override
    public void drawShape(){
        System.out.println("Drawing a corcle");
    }
    @Override
    public void fillColor(){
        System.out.println("Filling the cricle with green");
    }
}

