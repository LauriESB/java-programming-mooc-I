
import java.util.Scanner;

public class Squared {

    public static void main(String[] args) {
        // Write a program that reads two integers from the user and prints the square root 
        // of the sum of these integers. The program does not need to work with negative values.
        
        Scanner scanner = new Scanner(System.in);
        int number = Integer.valueOf(scanner.nextLine());
        
        number = (int) Math.pow(number, 2);
        System.out.println(number);
    }
}
