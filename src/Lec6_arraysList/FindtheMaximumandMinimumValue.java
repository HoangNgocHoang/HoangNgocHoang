package Lec6_arraysList;

public class FindtheMaximumandMinimumValue {
    public static void main(String[] args) {
        int[] number = {12, 49, -2, 26, 5};
        if (number.length == 0) {
            System.out.println("empty array");
            return;
        }
        int min = number[0];
        int max = number[0];
        for (int i = 1; i < number.length; i++) {
            if (number[i] < min) {
                min = number[i];
            }
            if (number[i] > max) {
                max = number[i];
            }
        }
        System.out.println("The minimum value is : " + min);
        System.out.println("The largest value is : " + max);
    }
}
