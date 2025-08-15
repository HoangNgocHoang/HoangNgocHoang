
package Lec3_Variable;
import java.util.Scanner;
public class exercise10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("##|\\n");
        System.out.println("Enter words separated by '##':");
        while (scanner.hasNext())
        {
            System.out.println(scanner.next());
        }
        scanner.close();
    }
    
}
