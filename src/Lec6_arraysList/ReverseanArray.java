package Lec6_arraysList;

import java.util.Arrays;

public class ReverseanArray {

    public static void reverse(int[] number) {
        for (int i = 0; i < number.length / 2; i++) {
            int temp = number[i];
            number[i] = number[number.length - 1 - i];
            number[number.length - 1 - i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] array = {11, 42, -5, 27, 0, 89};
        System.out.println("Initial array : " + Arrays.toString(array));
        reverse(array);
        System.out.println("Array after being reversed : " + Arrays.toString(array));
    }
}
