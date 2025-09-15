package exercise_Book;
public abstract class Book implements IBook {
    private String id;
    private String title;
    private double basePrice;

    public Book(String id, String title, double basePrice) {
        this.id = id;
        this.title = title;
        this.basePrice = basePrice;
    }

    // Getter & Setter
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public double getBasePrice() { return basePrice; }
    public void setBasePrice(double basePrice) { this.basePrice = basePrice; }

    public void addBook(Book book) {
        // để BookList xử lý
    }

    @Override
    public boolean updateBookById(String id) {
        return false; // để BookList xử lý
    }

    @Override
    public void displayDetails() {
        System.out.println("ID: " + getId() +
                           ", Title: " + getTitle() +
                           ", Base Price: " + getBasePrice());
    }

    @Override
    public abstract double calculatePrice();
}
