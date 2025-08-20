package Lec4_conditionalExecution;

import java.util.Scanner;

public class DayoftheWeek {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = scanner.nextInt();
        switch (n) {
            case 7:
                System.out.println("Saturday \n");
                break;
            case 6:
                System.out.println("Friday \n");
                break;
            case 5:
                System.out.println("thursday \n");
                break;
            case 4 :
                System.out.println("wednesday \n");
                break;
            case 3:
                System.out.println("tuesday \n");
                break;
            case 2:
                System.out.println("Monday \n");
                break;
            default:
                System.out.println("Erorr \n");
    }
    }
}
