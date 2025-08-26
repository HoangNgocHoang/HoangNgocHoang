
package Lec6_arraysList;
import java.util.Scanner;
public class Count_Occurrences {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int[] number = {2,5,6,5,2,5,8};
            System.out.println("Nhap so can tim :");
            int n = scanner.nextInt();
            int count = 0;
            for (int num : number){
                if(num == n){
                    count++;
                }
            }
            System.out.println("number " + n +" appear " + count + " time ");
        }
    }
}