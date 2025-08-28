package Lec6_arraysList;

import java.util.Arrays;

public class MergeTwoSortedArrays {

    public static int[] merge(int[] arr1, int[] arr2) {
        int n1 = arr1.length;
        int n2 = arr2.length;
        int[] result = new int[n1 + n2];
        int i = 0, j = 0, k = 0;
        // Hợp nhất hai mảng khi cả hai đều còn phần tử
        while (i < n1 && j < n2) {
            if (arr1[i] <= arr2[j]) {
                result[k++] = arr1[i++];
            } else {
                result[k++] = arr2[j++];
            }
        }
        // Sao chép các phần tử còn lại của arr1 (nếu có)
        while (i < n1) {
            result[k++] = arr1[i++];
        }
        // Sao chép các phần tử còn lại của arr2 (nếu có)
        while (j < n2) {
            result[k++] = arr2[j++];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 4, 6};
        int[] arr2 = {2, 3, 5, 7};
        int[] mergedArray = merge(arr1, arr2);
        System.out.println("Mảng sau khi hợp nhất: " + Arrays.toString(mergedArray));
    }
}
