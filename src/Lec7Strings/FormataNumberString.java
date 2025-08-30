/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lec7Strings;

import java.util.Scanner;

public class FormataNumberString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập một chuỗi số: ");
        String numberStr = scanner.nextLine();
        StringBuilder sb = new StringBuilder(numberStr);
        // Bắt đầu chèn từ vị trí 3 ký tự tính từ cuối
        for (int i = sb.length() - 3; i > 0; i -= 3) {
            sb.insert(i, ',');
        }
        System.out.println("Chuỗi sau khi định dạng: " + sb.toString());
        scanner.close();
    }
}
