package Lec5_Loops;

import java.util.Scanner;

public class CalculatetheSumofNumbersfrom1toN {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number :");
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
            System.out.println(" The sum of numbers from" +n +"to" +sum);
        }
    }
}
