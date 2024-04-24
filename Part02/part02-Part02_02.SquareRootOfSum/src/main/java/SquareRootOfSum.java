
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
       
        // Write a program that reads two integers from the user 
        // and prints the square root of the sum of these integers. 
        // The program does not need to work with negative values.
       
        Scanner scanner = new Scanner(System.in);
       
        int n1 = Integer.valueOf(scanner.nextLine());
        int n2 = Integer.valueOf(scanner.nextLine());
       
        int sum = n1 + n2;
       
        double squareRoot = Math.sqrt(sum);
        System.out.println(squareRoot);
    }
}
