
package Lec4_conditionalExecution;
import java.util.Scanner;
public class TriangleClassifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length of the first side 1 :");
        int a = scanner.nextInt();
        System.out.println("Enter length of the first side 2:");
        int b = scanner.nextInt();
        System.out.println("Enter length of the first side 3:");
        int c = scanner.nextInt();
        if (a + b > c && a + c > b && b + c > a) {
            if (a == b && b == c) {
                System.out.println("This is an equilateral triangle.");
            } else if (a == b || a == c || b == c) {
                System.out.println("This is an isosceles triangle.");
            } else {
                System.out.println("This is a scalene triangle.");
            }
        } else {
            System.out.println("These sides cannot form a triangle.");
        }
    }
}
