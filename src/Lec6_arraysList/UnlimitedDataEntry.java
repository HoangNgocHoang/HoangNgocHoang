package Lec6_arraysList;

import java.util.Scanner;
import java.util.ArrayList;


public class UnlimitedDataEntry {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> number = new ArrayList<>();
        int sum = 0;
        System.out.println("enter integers (enter - 1 to shop :");
        while (true) {
            int num = scanner.nextInt();
            if (num == -1) {
                break;
            }
            number.add(num);
            sum += num;
        }
        System.out.println("Number entered :" + number);
        System.out.println("sum :" + sum);
    }
}
