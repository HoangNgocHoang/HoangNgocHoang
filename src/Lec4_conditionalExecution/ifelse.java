package Lec4_conditionalExecution;

import java.util.Scanner;

public class ifelse {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = 42;
        int y = 17;
        int z = 25;
        if (y < x && y <= z) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        if (x % 2 == y % 2 || x % 2 == z % 2) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        if (x <= y + z && x >= y + z) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        if (!(x < y && x < z)) {
            System.out.println("true");
        } else {
            System.out.println("flase");

        }
        if ((x + y) % 2 == 0 || !((z - y) % 2 == 0)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
