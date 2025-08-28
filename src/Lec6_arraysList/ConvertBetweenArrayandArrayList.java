package Lec6_arraysList;

import java.util.Arrays;
import java.util.ArrayList;

public class ConvertBetweenArrayandArrayList {

    public static ArrayList<String> arrayToArrayList(String[] arr) {
        ArrayList<String> list = new ArrayList<>();
        for (String item : arr) {
            list.add(item);
        }
        return list;
    }

    public static String[] arrayListToArray(ArrayList<String> list) {
        
        return list.toArray(new String[0]);
    }

    public static void main(String[] args) {
        // Test 1: Array to ArrayList
        String[] namesArray = {"An", "Bình"};
        ArrayList<String> namesList = arrayToArrayList(namesArray);
        System.out.println("ArrayList từ Array: " + namesList);
        // Test 2: ArrayList to Array
        ArrayList<String> citiesList = new ArrayList<>(Arrays.asList("Cường", "Dũng"));
        String[] citiesArray = arrayListToArray(citiesList);
        System.out.println("Array từ ArrayList: " + Arrays.toString(citiesArray));
    }
}
// Cách 1: Dùng vòng lặp
        // String[] arr = new String[list.size()];
        // for (int i = 0; i < list.size(); i++) {
        // arr[i] = list.get(i);
        // }
        // return arr;
        // Cách 2: Dùng phương thức toArray()