package Lec7Strings;

import java.util.Scanner;

public class CountWordsinaString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập một chuỗi: ");
        String input = scanner.nextLine();

        // Bỏ khoảng trắng ở hai đầu
        String trimmedInput = input.trim();

        int wordCount;
        if (trimmedInput.isEmpty()) {
            wordCount = 0;
        } else {
            // Tách chuỗi bằng một hoặc nhiều khoảng trắng
            String[] words = trimmedInput.split("\\s+");
            wordCount = words.length;
        }

        System.out.println("Số từ trong chuỗi là: " + wordCount);
        scanner.close();
    }
}

