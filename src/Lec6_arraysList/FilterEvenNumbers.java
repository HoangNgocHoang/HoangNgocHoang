package Lec6_arraysList;

import java.util.ArrayList;
import java.util.Arrays;

public class FilterEvenNumbers {

    public static ArrayList<Integer> filterEven(int[] arr) {
        ArrayList<Integer> evenList = new ArrayList<>();
        for (int num : arr) {
            if (num % 2 == 0) {
                evenList.add(num);
            }
        }
        return evenList;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println("Original array: " + Arrays.toString(array));

        ArrayList<Integer> evenNumbers = filterEven(array);
        System.out.println("Even numbers ArrayList: " + evenNumbers);
    }
}
