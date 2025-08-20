package Lec4_conditionalExecution;
import java.util.Scanner;
public class EvenorOddChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int d = scanner.nextInt();
        System.out.println("Output : "+ d);
        if ( d % 2 == 0){
            System.out.println("even number");
        }else {
            System.out.println("odd number");
        }
    }
}
