package Lec5_Loops;
import java.util.Scanner;
public class SumofDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number :");
        int number = scanner.nextInt();
        int originalNumber = number;
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            sum += digit;
            number /= 10;
        }
        System.out.println("Sum : " + originalNumber + " is " + sum);
        scanner.close();

    }
}