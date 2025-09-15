
package exercise_Book;

public class TextBook extends Book {
    private String subject;

    public TextBook(String id, String title, double basePrice, String subject) {
        super(id, title, basePrice);
        this.subject = subject;
    }

    // Getter & Setter
    public String getSubject() { return subject; }
    public void setSubject(String subject) { this.subject = subject; }

    @Override
    public void displayDetails() {
        System.out.println("TextBook - ID: " + getId() +
                           ", Title: " + getTitle() +
                           ", Subject: " + getSubject() +
                           ", Price: " + calculatePrice());
    }

    @Override
    public double calculatePrice() {
        return getBasePrice() * 1.1; // tăng 10%
    }

    @Override
    public void addbook(Book Book) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}