
package Lec6_arraysList;

import java.util.Arrays;

public class ConcatenateTwoArrays {

    public static int[] concatenate(int[] a1, int[] a2) {
        int[] result = new int[a1.length + a2.length];

        // Sao chép mảng a1
        for (int i = 0; i < a1.length; i++) {
            result[i] = a1[i];
        }
        // Sao chép mảng a2
        for (int i = 0; i < a2.length; i++) {
            result[a1.length + i] = a2[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6};
        int[] combined = concatenate(arr1, arr2);
        System.out.println("Mảng sau khi nối: " + Arrays.toString(combined));
    }
}
