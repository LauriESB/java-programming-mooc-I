
import java.util.Scanner;

public class ComparingNumbers {

    public static void main(String[] args) {
        
        // Write a program that reads two integers from the user. 
        // If the first number is greater than the second, the program prints "(first) is greater than (second)." 
        // If the first number is less than the second, the program prints "(first) is smaller than (second)." 
        // Otherwise, the program prints "(first) is equal to (second)." 
        // The (first) and (second) should always be replaced with the actual numbers that were provided by the user.
        
        Scanner scanner = new Scanner(System.in);

        int n1 = Integer.valueOf(scanner.nextLine());
        int n2 = Integer.valueOf(scanner.nextLine());
        
        if (n1 > n2) {
            System.out.println(n1 + " is greater than " + n2);
        }else if (n1 < n2) {
            System.out.println(n1 + " is smaller than " + n2);
        }else {
            System.out.println(n1 + " is equal to " + n2);
        }
    }
}
