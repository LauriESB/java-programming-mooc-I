
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        
        // Implement a program, which calculates the sum 1+2+3+...+n where n is given as user input.
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Last number?");
        int n1 = Integer.valueOf(scanner.nextLine());
        
        int sum = 0;
        for(int aux = 1; aux <= n1; aux++) {
            sum += aux;
        }
        System.out.println("The sum is " + sum);
    }
}

