package Lec6_arraysList;

import java.util.Arrays;

public class SwapTwoElementsinanArray {

    public static void swap(int[] arr, int index1, int index2) {
        // Kiểm tra tính hợp lệ của chỉ số
        if (index1 < 0 || index1 >= arr.length || index2 < 0 || index2 >= arr.length) {
            System.out.println("Chỉ số không hợp lệ.");
            return;
        }
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30};
        System.out.println("Mảng ban đầu: " + Arrays.toString(numbers));
        swap(numbers, 0, 2);
        System.out.println("Mảng sau khi hoán đổi vị trí 0 và 2: " + Arrays.toString(numbers));
    }
}
