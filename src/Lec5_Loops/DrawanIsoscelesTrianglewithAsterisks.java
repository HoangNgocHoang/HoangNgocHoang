package Lec5_Loops;

import java.util.Scanner;

public class DrawanIsoscelesTrianglewithAsterisks {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("H :");
        int h = scanner.nextInt();
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < h - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                if (i == h - 1 || j == 0 || j == 2 * i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }}}