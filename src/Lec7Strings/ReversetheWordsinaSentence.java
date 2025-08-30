package Lec7Strings;

public class ReversetheWordsinaSentence {

    public static void main(String[] args) {
        String text = "Java is fun";
        String[] past = text.split(" ");
        for (int i = past.length - 1; i >= 0; i--) {

            System.out.print(past[i]);

        }
    }
}
