package Lec5_Loops;

import java.util.Scanner;

public class PrimeNumberCheck {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer greater than 1: ");
        int N = scanner.nextInt();

        if (N <= 1) {
            System.out.println("Number must be greater than 1.");
        } else {
            boolean isPrime = true;

            for (int i = 2; i <= Math.sqrt(N); i++) {
                if (N % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println(N + " is a prime number.");
            } else {
                System.out.println(N + " is not a prime number.");
            }
        } 

               scanner.close();
    }
}
