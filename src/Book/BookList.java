package Book;

import java.util.ArrayList;
import java.util.Iterator;

public class BookList {

     ArrayList<Book> booklist = new ArrayList<>();

    public void addBook(Book book) {
        booklist.add(book);
        System.out.println("Added");
    }

    public void updateBook(String id) {
        for (Book book : booklist) {
            if (book.getBookid().equals(id)) {
                book.updateBook(id);  // giả sử trong Book có hàm này
                return;
            }
        }
        System.out.println("Not found ID: " + id);
    }

    public void deleteBookById(String id) {
        Iterator<Book> iterator = booklist.iterator();
        while (iterator.hasNext()) {
            Book book = iterator.next();
            if (book.getBookid().equals(id)) {
                iterator.remove();
                System.out.println("Deleted ID: " + id);
                return;
            }
        }
        System.out.println("Not found ID: " + id);
    }

    public Book findBookById(String id) {
        for (Book book : booklist) {
            if (book.getBookid().equals(id)) {
                return book;
            }
        }
        System.out.println("Not found ID: " + id);
        return null;
    }

    public void displayAllBooks() {
        if (booklist.isEmpty()) {
            System.out.println("Empty");
        } else {
            for (Book book : booklist) {
                book.displayBook(); // phải đúng tên hàm trong lớp Book
            }
        }
    }
}
