/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lec6_arraysList;
import java.util.*;
public class FindtheSecondLargestElement {
    public static void main(String[] args) {
        int[] numbers = {10, 5, 8, 20, 15, 20};

        if (numbers.length < 2) {
            System.out.println("Array must have at least two elements.");
            return;
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : numbers) {
            if (num > largest) {
                // Update secondLargest before updating largest
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num < largest) {
                // Update secondLargest only if num is smaller than largest
                secondLargest = num;
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("No second-largest element found (all elements may be equal).");
        } else {
            System.out.println("The second-largest element is: " + secondLargest);
        }
    }
}


