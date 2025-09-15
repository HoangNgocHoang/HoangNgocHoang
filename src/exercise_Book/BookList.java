
package exercise_Book;
import java.util.ArrayList;

public class BookList {
    private ArrayList<Book> bookList;

    public BookList() {
        this.bookList = new ArrayList<>();
    }

    // Getter & Setter
    public ArrayList<Book> getBookList() { return bookList; }
    public void setBookList(ArrayList<Book> bookList) { this.bookList = bookList; }

    public void addBook(Book book) {
        bookList.add(book);
    }

    public boolean updateBookById(String id) {
        for (Book b : bookList) {
            if (b.getId().equals(id)) {
                b.setTitle(b.getTitle() + " (Updated)");
                return true;
            }
        }
        return false;
    }

    public boolean deleteBookById(String id) {
        return bookList.removeIf(b -> b.getId().equals(id));
    }

    public Book findBookById(String id) {
        for (Book b : bookList) {
            if (b.getId().equals(id)) return b;
        }
        return null;
    }

    public void displayAllBooks() {
        for (Book b : bookList) {
            b.displayDetails();
        }
    }

    public Book findMostExpensiveBook() {
        if (bookList.isEmpty()) return null;
        Book maxBook = bookList.get(0);
        for (Book b : bookList) {
            if (b.calculatePrice() > maxBook.calculatePrice()) {
                maxBook = b;
            }
        }
        return maxBook;
    }

    public void countBooks() {
        int countText = 0, countRef = 0;
        for (Book b : bookList) {
            if (b instanceof TextBook) countText++;
            else if (b instanceof ReferenceBook) countRef++;
        }
        System.out.println("Total TextBooks: " + countText);
        System.out.println("Total ReferenceBooks: " + countRef);
    }
}
