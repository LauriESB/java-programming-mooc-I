 
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        
        // Write a program that asks the user for input until the user inputs 0. 
        // After this, the program prints the average of the numbers. 
        // The number zero does not need to be counted to the average. 
        // You may assume that the user inputs at least one number.
        
        Scanner scanner = new Scanner(System.in);
        
        int numInputs = 0;
        int sum = 0;
        
        while(true){
            System.out.println("Give a number: ");
            int n1 = Integer.valueOf(scanner.nextLine());
            
            if(n1 == 0) {
                break;
            }
            numInputs = numInputs + 1;
            sum = sum + n1;
            
        }
        double average = 1.0 * sum / numInputs;
        System.out.println("Average of the numbers: " + average);
        
    }
}
