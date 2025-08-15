
package Lec3_Variable;
import java.util.Scanner;
public class exercise4 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a real number : ");
        double a = keyboard.nextDouble();
        double b = keyboard.nextDouble();
        double c = (a + b)/ 2.0;
        System.out.println("average value :" + c );
    }
   
}
