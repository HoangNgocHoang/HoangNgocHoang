package Lec5_Loops;

import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number :");
        int n = scanner.nextInt();
        for (int i = 2; i <= 9; i++) {
            System.out.print("multiplication table " + n);
            for (int j = 1; j <= 10 ; j++) {
                System.out.println(i + "x" + j + "=" +(i*j));
            }
        }
    }
}
