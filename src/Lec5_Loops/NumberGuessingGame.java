package Lec5_Loops;

import java.util.Random;
import java.util.Scanner;
public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Sinh số bí mật từ 1 đến 100
        int secretNumber = random.nextInt(100) + 1;
        int guess = 0; // giá trị người chơi đoán

        System.out.println("=== Number Guessing Game ===");
        System.out.println("I have chosen a number between 1 and 100.");
        System.out.println("Try to guess it!");

        // Lặp đến khi đoán đúng
        while (guess != secretNumber) {
            System.out.print("Your guess: ");
            guess = scanner.nextInt();

            if (guess > secretNumber) {
                System.out.println("Your number is higher than the secret number.");
            } else if (guess < secretNumber) {
                System.out.println("Your number is lower than the secret number.");
            } else {
                System.out.println(" 55Congratulations! You guessed correctly!");
            }
        }

        scanner.close();
    }
}
