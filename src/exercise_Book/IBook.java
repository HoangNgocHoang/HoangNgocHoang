
package exercise_Book;

public interface IBook {
   void addbook(Book Book);
   boolean updateBookById(String id);
   void displayDetails();
   double calculatePrice();   
}
