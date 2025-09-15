/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lec9_InheritanceAndPolymorphism.SuperKeyWord.Aggregation;

/**
 *
 * @author Hoang
 */
public class Book {

    private String BookID;
    private String title;
    private Author author;

    public Book(String BookID, String title, Author author) {
        this.BookID = BookID;
        this.title = title;
        this.author = author;
    }

    public Book() {

    }

    public String getID() {
        return BookID;
    }

    public void setID(String ID) {
        this.BookID = BookID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" + "BookID=" + BookID + '\''
                + ",Title='" + title + '\''
                + ",author = " + author
                + '}';
    }
}
