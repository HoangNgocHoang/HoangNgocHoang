
package Lec5_Loops;
import java.util.Scanner;
public class CalculateAverageUntil0isEntered {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number;
        int sum = 0;
        int count = 0;

        System.out.println("Enter numbers (enter 0 to stop):");

        // Vòng lặp nhập số
        while (true) {
            System.out.print("Enter a number: ");
            number = scanner.nextInt();

            if (number == 0) {
                break; // dừng vòng lặp nếu nhập 0
            }

            sum += number;   // cộng dồn tổng
            count++;         // tăng số lượng số
        }

        // Tính và in ra trung bình
        if (count > 0) {
            double average = (double) sum / count;
            System.out.println("The average is: " + average);
        } else {
            System.out.println("No numbers were entered.");
        }

        scanner.close();
    }
}
