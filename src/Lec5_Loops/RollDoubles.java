
package Lec5_Loops;
import java.util.Random;

public class RollDoubles {
    public static void main(String[] args) {
        Random random = new Random();
       
        int die1, die2;
        int tries = 0;

        do {
            tries++;
            die1 = random.nextInt(6) + 1;
            die2 = random.nextInt(6) + 1;
            System.out.println("Roll " + tries + ": " + die1 + " and " + die2);
        } while (die1 != die2);

        System.out.println("You rolled doubles after " + tries + " tries!");
        
    }
}
