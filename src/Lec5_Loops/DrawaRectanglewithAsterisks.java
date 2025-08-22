package Lec5_Loops;

import java.util.Scanner;

public class DrawaRectanglewithAsterisks {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter H :");
        int h = scanner.nextInt();
        System.out.println("Enter r :");
        int r = scanner.nextInt();
        for (int i = 1; i <= h; i++) {
            for (int j = i; j <= r ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }}
