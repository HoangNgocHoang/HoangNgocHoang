package Lec4_conditionalExecution;

import java.util.Scanner;

public class QuadrantDetermination {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter x :");
        double x = scanner.nextDouble();
        System.out.println("enter y :");
        double y = scanner.nextDouble();
        if (x > 0 && y > 0) {
            System.out.println("Quadrant 1");
        } else if (x < 0 && y > 0) {
            System.out.println("Quadrant 2");
        } else if (x < 0 && y < 0) {
            System.out.println("Quadrant 3");
        } else if (x > 0 && y < 0) {
            System.out.println("Quadrant 4");
        } else if (x == 0 && y == 0) {
            System.out.println(" the point is on an axis.");
        }
    }
}
