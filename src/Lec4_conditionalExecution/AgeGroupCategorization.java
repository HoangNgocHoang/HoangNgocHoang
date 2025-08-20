package Lec4_conditionalExecution;

import java.util.Scanner;

public class AgeGroupCategorization {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter age : ");
        int s = scanner.nextInt();
        System.out.println("Output age " + s);
        if (s >= 0 && s <= 12) {
            System.out.println("Child");
        } else if (s >= 13 && s <= 19) {
            System.out.println("teenager");
        } else if (s >= 20 && s <= 59) {
            System.out.println("adult");
        } else if (s >= 60) {
            System.out.println(" senior ");
        }

    }
}
