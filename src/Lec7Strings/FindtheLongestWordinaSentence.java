/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lec7Strings;

import java.util.Scanner;

public class FindtheLongestWordinaSentence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập một câu: ");
        String sentence = scanner.nextLine();

        String[] words = sentence.split("\\s+");

        String longestWord = "";
        for (String word : words) {
            // Bỏ các ký tự không phải chữ cái để so sánh chính xác hơn
            String cleanWord = word.replaceAll("[^a-zA-Z]", "");
            if (cleanWord.length() > longestWord.length()) {
                longestWord = cleanWord;
            }
        }

        System.out.println("Từ dài nhất trong câu là: " + longestWord);
        scanner.close();
    }
}
