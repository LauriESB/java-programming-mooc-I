
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        
        // Implement a program which calculates the sum of a closed interval, and prints it. 
        // Expect the user to write the smaller number first and then the larger number.
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("First number?");
        int n1 = Integer.valueOf(scanner.nextLine());
        
        System.out.println("Last number?");
        int n2 = Integer.valueOf(scanner.nextLine());
        
        
        int sum = 0;
        for(int aux = n1; aux <= n2; aux++) {
            sum += aux;
        }
        System.out.println("The sum is " + sum);
        
    }
}
