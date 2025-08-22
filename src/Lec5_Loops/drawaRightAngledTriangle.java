package Lec5_Loops;

import java.util.Scanner;

public class drawaRightAngledTriangle {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter H :");
        int h = scanner.nextInt();
        for (int i = 1; i <= h; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
                
            }
            System.out.println("");
        }
        scanner.close();
    }
}
