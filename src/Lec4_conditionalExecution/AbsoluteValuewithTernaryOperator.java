
package Lec4_conditionalExecution;
import java.util.Scanner;
public class AbsoluteValuewithTernaryOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number : ");
        int number = scanner.nextInt();
        int absValue;
        if (number >= 0) {
            absValue = number;
        } else {
            absValue = -number;
        }
            System.out.println("The absolute value is"+absValue);    
    }
}
