package Lec4_conditionalExecution;

import java.util.Scanner;

public class AcademicGrading {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter point :");
        double point = scanner.nextDouble();
        if (point >= 9.0 && point <= 10) {
            System.out.println("Excellent");
        } else if (point >= 8.0 && point <= 8.9) {
            System.out.println("good");
        } else if (point >= 6.5 && point <= 7.9) {
            System.out.println("fair");
        } else if (point >= 5.0 && point <= 6.4) {
            System.out.println("average");
        } else if (point <= 5.0){
          System.out.println("fail");
        }else{
            System.out.println("eroor");
        }
            
        
    }
}