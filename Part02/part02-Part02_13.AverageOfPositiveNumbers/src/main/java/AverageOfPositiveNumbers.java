
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        
        // Write a program that asks the user for input until the user inputs 0. 
        // After this, the program prints the average of the positive numbers (numbers that are greater than zero).
        // If no positive number is inputted, the program prints "Cannot calculate the average"
        
        Scanner scanner = new Scanner(System.in);
        
        int numInput = 0;
        int sum = 0;
        
        while(true){
            int n1 = Integer.valueOf(scanner.nextLine());

            if(n1 == 0) {
                break;
            }else if(n1 > 0) {
                numInput = numInput + 1;
                sum = sum + n1;
            }
        }
        if(sum > 0) {
            double average = 1.0 * sum / numInput;
            System.out.println(average);
        }else {
            System.out.println("Cannot calculate the average");
        }     
    }
}
