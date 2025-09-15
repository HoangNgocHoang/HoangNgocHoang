/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise_Book;
public class ReferenceBook extends Book {
 private String publisher;

    public ReferenceBook(String id, String title, double basePrice, String publisher) {
        super(id, title, basePrice);
        this.publisher = publisher;
    }

    // Getter & Setter
    public String getPublisher() { return publisher; }
    public void setPublisher(String publisher) { this.publisher = publisher; }

    @Override
    public void displayDetails() {
        System.out.println("ReferenceBook - ID: " + getId() +
                           ", Title: " + getTitle() +
                           ", Publisher: " + getPublisher() +
                           ", Price: " + calculatePrice());
    }

    @Override
    public double calculatePrice() {
        return getBasePrice() * 1.2; // tăng 20%
    }

    @Override
    public void addbook(Book Book) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
