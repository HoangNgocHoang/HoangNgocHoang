/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lec9_InheritanceAndPolymorphism.SuperKeyWord.Aggregation;

/**
 *
 * @author Hoang
 */
public class Processor {
    public static void main(String[] args) {
        Author author = new Author("101","Napoleon Hill");
        Book book = new Book("1", "Think and Grow Rich",author);
        System.out.println("Book information" +book);
    }
}
