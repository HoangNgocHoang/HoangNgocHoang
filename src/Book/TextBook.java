
package Book;

public class TextBook extends Book {
    private String subject;

    public TextBook() {
    }

    public TextBook(String subject) {
        this.subject = subject;
    }

    public TextBook(String subject, String id, String title, double basePrice) {
        super(id, title, basePrice);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
    @Override
    public void displayDetails(){
        System.out.println("Enter ID:" + getId() 
        + "Enter Title:" + getTitle()
        + "Enter subject:" + getSubject()
        + "CalculatePrice :" + calculatePrice());  
        
    }
    @Override
    public double calculatePrice(){
        return getBasePrice() * 1.1;
    }
    @Override
    public void addBook(Book book){
    }  

    @Override
    public boolean updateBookById(String id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
