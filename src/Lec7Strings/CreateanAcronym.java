package Lec7Strings;

import java.util.Scanner;

public class CreateanAcronym {

    public class AcronymGenerator {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Nhập một cụm từ: ");
            String phrase = scanner.nextLine();

            String[] words = phrase.trim().split("\\s+");
            StringBuilder acronym = new StringBuilder();

            for (String word : words) {
                if (word.length() > 0) {
                    acronym.append(word.charAt(0));
                }
            }

            System.out.println("Từ viết tắt: " + acronym.toString().toUpperCase());
            scanner.close();
        }
    }
}
