
package Lec6_arraysList;

import java.util.Scanner;

public class CharacterFrequencyArray {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập một chuỗi văn bản (chữ thường): ");
        String text = scanner.nextLine().toLowerCase();
        // Mảng để lưu tần suất của 26 chữ cái từ 'a' đến 'z'
        int[] frequency = new int[26];
        // Duyệt qua chuỗi và đếm
        for (char c : text.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                frequency[c - 'a']++; // c - 'a' sẽ cho chỉ số từ 0-25
            }
        }
        // In kết quả
        System.out.println("Tần suất xuất hiện của các ký tự:");
        for (int i = 0; i < 26; i++) {
            if (frequency[i] > 0) {
                // (char)('a' + i) để chuyển chỉ số về lại ký tự
                System.out.println((char) ('a' + i) + ": " + frequency[i]);
            }
        }
        scanner.close();
    }
}
