
import java.util.Scanner;

public class Counting {

    public static void main(String[] args) {
        
        // Write a program that reads an integer from the user. 
        // Next, the program prints numbers from 0 to the number given by the user. 
        // You can assume that the user always gives a positive number.
        
        Scanner scanner = new Scanner(System.in);
        
        int n1 = Integer.valueOf(scanner.nextLine());
        int i = 0;
        
        while(i <= n1) {
            System.out.println(i);
            i++;
        }
    }
}
