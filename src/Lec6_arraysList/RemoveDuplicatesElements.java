package Lec6_arraysList;
import java.util.ArrayList;

public class RemoveDuplicatesElements {
    
    
    public static ArrayList<Integer> removeDuplicatesElements(ArrayList<Integer> list) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int num : list) {
            if (!result.contains(num)) {
                result.add(num);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(3);
        numbers.add(2);
        numbers.add(1);
        numbers.add(4);
        numbers.add(3);
        numbers.add(5);

        System.out.println("Original list: " + numbers);
        ArrayList<Integer> noDuplicates = removeDuplicatesElements(numbers);
        System.out.println("List without duplicates: " + noDuplicates);
    }
}
