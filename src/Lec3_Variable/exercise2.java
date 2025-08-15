
package Lec3_Variable;
import java.util.Scanner;
public class exercise2 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Enter Name :");
        String sentence = keyboard.nextLine();
        
        System.out.print("Enter age :");
        String s = keyboard.next();
        System.out.print("Hello " + sentence);
        System.out.print(" You are "+ s);
        System.out.print(" year old ");
    }
}
