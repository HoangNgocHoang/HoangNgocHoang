package Lec3_Variable;

import java.util.Scanner;

public class exercise8 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter : ");
        while (true) {
            String sentence = keyboard.next(); 
            if (sentence.equalsIgnoreCase("stop")) {
                break;
            }
            System.out.println(sentence);
        }
    }
}