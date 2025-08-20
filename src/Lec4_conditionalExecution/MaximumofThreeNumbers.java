package Lec4_conditionalExecution;

import java.util.Scanner;

public class MaximumofThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter integer 1: ");
        int a = scanner.nextInt();
        System.out.print("Enter integer 2: ");
        int b = scanner.nextInt();
        System.out.print("Enter integer 3: ");
        int c = scanner.nextInt();
        if (a >= b && a >= c) {
            System.out.println("output " + a);
        } else if (b >= a && b >= c){
            System.out.println("output " + b);
        } else 
            System.out.println("output "+c);
    }
  }
    
