package Lec6_arraysList;

import java.util.Scanner;
import java.util.ArrayList;

public class ToDoListManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> todoList = new ArrayList<>();
        int choice;

        do {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Add a new task");
            System.out.println("2. View all tasks");
            System.out.println("3. Remove a task by its position (index)");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // bỏ dòng thừa sau khi nhập số

            switch (choice) {
                case 1:
                    System.out.print("Enter a new task: ");
                    String task = scanner.nextLine();
                    todoList.add(task);
                    System.out.println("Task added!");
                    break;

                case 2:
                    System.out.println("Task list:");
                    if (todoList.isEmpty()) {
                        System.out.println("List is empty.");
                    } else {
                        for (int i = 0; i < todoList.size(); i++) {
                            System.out.println((i + 1) + ". " + todoList.get(i));
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter the task number to remove: ");
                    int index = scanner.nextInt();
                    if (index > 0 && index <= todoList.size()) {
                        todoList.remove(index - 1);
                        System.out.println("Task removed!");
                    } else {
                        System.out.println("Invalid index!");
                    }
                    break;

                case 4:
                    System.out.println("Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice, try again.");
            }
        } while (choice != 4);

        scanner.close();
    }
}
