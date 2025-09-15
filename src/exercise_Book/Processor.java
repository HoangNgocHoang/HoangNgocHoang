
package exercise_Book;

import java.util.Scanner;

public class Processor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BookList bookList = new BookList();

        while (true) {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Add new textbook");
            System.out.println("2. Add new reference book");
            System.out.println("3. Update book by id");
            System.out.println("4. Delete book by id");
            System.out.println("5. Find book by id");
            System.out.println("6. Display all books");
            System.out.println("7. Find the most expensive book");
            System.out.println("8. Count books by type");
            System.out.println("9. Exit");
            System.out.print("Choose: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter id: ");
                    String idT = sc.nextLine();
                    System.out.print("Enter title: ");
                    String titleT = sc.nextLine();
                    System.out.print("Enter base price: ");
                    double priceT = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Enter subject: ");
                    String subject = sc.nextLine();
                    bookList.addBook(new TextBook(idT, titleT, priceT, subject));
                }
                case 2 -> {
                    System.out.print("Enter id: ");
                    String idR = sc.nextLine();
                    System.out.print("Enter title: ");
                    String titleR = sc.nextLine();
                    System.out.print("Enter base price: ");
                    double priceR = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Enter publisher: ");
                    String publisher = sc.nextLine();
                    bookList.addBook(new ReferenceBook(idR, titleR, priceR, publisher));
                }
                case 3 -> {
                    System.out.print("Enter id to update: ");
                    String idU = sc.nextLine();
                    if (bookList.updateBookById(idU))
                        System.out.println("Updated successfully!");
                    else
                        System.out.println("Book not found!");
                }
                case 4 -> {
                    System.out.print("Enter id to delete: ");
                    String idD = sc.nextLine();
                    if (bookList.deleteBookById(idD))
                        System.out.println("Deleted successfully!");
                    else
                        System.out.println("Book not found!");
                }
                case 5 -> {
                    System.out.print("Enter id to find: ");
                    String idF = sc.nextLine();
                    Book found = bookList.findBookById(idF);
                    if (found != null) found.displayDetails();
                    else System.out.println("Book not found!");
                }
                case 6 -> bookList.displayAllBooks();
                case 7 -> {
                    Book expensive = bookList.findMostExpensiveBook();
                    if (expensive != null) {
                        System.out.println("Most expensive book:");
                        expensive.displayDetails();
                    } else System.out.println("No books in the list!");
                }
                case 8 -> bookList.countBooks();
                case 9 -> {
                    System.out.println("Exiting...");
                    return;
                }
                default -> System.out.println("Invalid choice!");
            }
        }
    }
}
