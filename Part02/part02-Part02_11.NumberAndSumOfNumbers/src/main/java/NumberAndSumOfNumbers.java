
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        
        // Write a program that asks the user for input until the user inputs 0. 
        // After this the program prints the amount of numbers inputted and the sum of the numbers. 
        // The number zero does not need to be added to the sum, but adding it does not change the results.
        
        Scanner scanner = new Scanner(System.in);
        
        int numInputs = 0;
        int sum = 0;
        
        while(true){
        
            System.out.println("Give a number:");
            int n1 = Integer.valueOf(scanner.nextLine());
            
            if(n1 == 0) {
                break;
            }
            
            numInputs = numInputs + 1;
            sum = sum + n1;
        }
        
        System.out.println("Number of numbers: " + numInputs);
        System.out.println("Sum of the numbers: " + sum);
    }
}
