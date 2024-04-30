
import java.util.Scanner;

public class DivisibleByThree {

    // Write a method public static void divisibleByThreeInRange(int beginning, int end) that prints all the numbers divisible by three in the given range. 
    // The numbers are to be printed in order from the smallest to the greatest.
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        divisibleByThreeInRange(1,10);
    }
    public static void divisibleByThreeInRange(int beginning, int end) {
    
        for(int i = beginning; i <= end; i++) {
            if(i % 3 == 0) {
                System.out.println(i);
            } 
        }
    }
}
