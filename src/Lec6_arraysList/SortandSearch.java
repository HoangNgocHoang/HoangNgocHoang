package Lec6_arraysList;

import java.util.Arrays;
import java.util.Scanner;

public class SortandSearch {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        // Nhập 5 số nguyên
        System.out.println("Enter 5 integers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Sắp xếp mảng
        Arrays.sort(numbers);
        System.out.println("Sorted array: " + Arrays.toString(numbers));

        // Nhập số cần tìm
        System.out.print("Enter a number to search: ");
        int target = scanner.nextInt();

        // Tìm thủ công (dùng vòng lặp)
        int index = -1;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            System.out.println("The number " + target + " was found at index " + index);
        } else {
            System.out.println("The number " + target + " was not found in the array.");
        }

        scanner.close();
    }
}