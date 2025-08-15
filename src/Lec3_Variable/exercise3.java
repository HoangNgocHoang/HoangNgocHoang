
package Lec3_Variable;
import java.util.Scanner;
public class exercise3 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter integers : ");
        int a = keyboard.nextInt();
        int b = keyboard.nextInt();
        int c = a + b;
        System.out.println("their sum :" + c );
    } 
}
