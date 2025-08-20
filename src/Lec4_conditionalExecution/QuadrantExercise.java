package Lec4_conditionalExecution;

import java.util.Scanner;

public class QuadrantExercise {

    public static int quadrant(double x, double y) {
        if (x > y && y > 0) {
            return 1;
        } else if (x < 0 && y > 0) {
            return 2;
        } else if (x < 0 && y < 0) {
            return 3;
        } else if (x > 0 && y < 0) {
            return 4;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter X : " );
        double x = scanner.nextDouble();
        System.out.println("Enter Y : " );
        double y = scanner.nextDouble();
        int z = quadrant(x,y);
        System.out.println("quadrant"+z);
        scanner.close();
    }
}
