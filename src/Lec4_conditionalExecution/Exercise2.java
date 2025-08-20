package Lec4_conditionalExecution;

import java.util.Scanner;

public class Exercise2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = scanner.nextInt();
        switch (n) {
            case 5:
                System.out.println("five \n");
                break;
            case 4:
                System.out.println("four \n");
                break;
            case 3:
                System.out.println("three \n");
                break;
            case 2:
                System.out.println("two \n");
                break;
            case 1:
                System.out.println("one \n");
                break;
            default:
                System.out.println("N/A \n");

        }
    }
}
