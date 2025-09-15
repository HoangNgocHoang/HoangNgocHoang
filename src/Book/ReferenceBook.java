package Book;

public abstract class ReferenceBook extends Book {

    private String publisher;

    public ReferenceBook() {
    }

    public ReferenceBook(String publisher) {
        this.publisher = publisher;
    }

    public ReferenceBook(String publisher, String id, String title, double basePrice) {
        super(id, title, basePrice);
        this.publisher = publisher;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    @Override
    public void displayDetails() {
        System.out.println("Id :" + getId()
                + "Title :" + getTitle()
                + "Publisher :" + getPublisher()
                + "CalculatePrice :" + calculatePrice());
    }

    @Override
    public double calculatePrice() {
        return getBasePrice() * 1.2;
    }

    @Override
    public void addBook(Book Book) {
    }


}
