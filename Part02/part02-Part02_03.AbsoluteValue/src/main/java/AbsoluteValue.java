
import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        
        // Write a program that reads an integer from the user. If the number is 
        // less than 0, the program prints the given integer multiplied by -1. 
        // In all other cases, the program prints the number itself.
        
        Scanner scanner = new Scanner(System.in);
        
        int n1 = Integer.valueOf(scanner.nextLine());
        
        if(n1 < 0) {
            System.out.println(n1 * -1);
        }else {
            System.out.println(n1);
        } 
    }
}
