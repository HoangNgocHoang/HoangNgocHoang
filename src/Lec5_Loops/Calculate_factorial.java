package Lec5_Loops;

import java.util.Scanner;

public class Calculate_factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter N :");
        int n = scanner.nextInt();
        int factorial = 1; // khoi tao bien gia thua 
        for (int i = 1; i <= n; i++) {
            factorial *= i;
            System.out.print(n + "!="+ factorial);
        }
    }
}
