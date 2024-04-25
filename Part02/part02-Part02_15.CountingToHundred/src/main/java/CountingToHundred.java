
import java.util.Scanner;

public class CountingToHundred {

    public static void main(String[] args) {
        
        // Write a program, which reads an integer from the user. 
        // Then the program prints numbers from that number to 100. 
        // You can assume that the user always gives a number less than 100.
        
        Scanner scanner = new Scanner(System.in);

        int n1 = Integer.valueOf(scanner.nextLine());
        
        int i = n1;
        
        while(i <= 100) {
            System.out.println(i);
            i++;
        }
    }
}
