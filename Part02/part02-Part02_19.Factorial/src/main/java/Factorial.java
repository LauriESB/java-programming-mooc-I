
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        
        // Implement a program which calculates the factorial of a number given by the user.
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Give a number:");
        int n1 = Integer.valueOf(scanner.nextLine());
        
        int sum = 1;
        for(int aux = 1; aux <= n1; aux++) {
            sum = aux * sum;   
        }
        System.out.println("Factorial: " + sum);
    }
}
