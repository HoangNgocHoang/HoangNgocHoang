package Lec3_Variable;
import java.util.Scanner;
public class exercise5 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a boolean value (true or false): ");
        boolean value = keyboard.nextBoolean();
        if (value) {
            System.out.println("You entered: true");
        } else {
            System.out.println("You entered: false");
        }
        keyboard.close();
    }
}
