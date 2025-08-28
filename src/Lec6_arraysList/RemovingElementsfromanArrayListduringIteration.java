package Lec6_arraysList;

import java.util.ArrayList;
import java.util.Arrays;

public class RemovingElementsfromanArrayListduringIteration {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(10, 60, 25, 80, 5, 95));
        System.out.println("Danh sách ban đầu: " + numbers);
        // Duyệt ngược danh sách để tránh lỗi khi xóa
        for (int i = numbers.size() - 1; i >= 0; i--) {
            if (numbers.get(i) > 50) {
                numbers.remove(i);
            }
        }
        System.out.println("Danh sách sau khi xóa các phần tử > 50: " + numbers);
    }
}


