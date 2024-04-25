
import java.util.Scanner;

public class NumberOfNumbers {

    public static void main(String[] args) {
        
        // Write a program that reads values from the user until they input a 0. After this, 
        // the program prints the total number of inputted values. 
        // The zero that's used to exit the loop should not be included in the total number count.
        
        Scanner scanner = new Scanner(System.in);
        
        int numInputs = 0;
        
        while(true){
        
            System.out.println("Give a number:");
            int n1 = Integer.valueOf(scanner.nextLine());

            if(n1 == 0) {
                break;
            }else {
                numInputs = numInputs + 1;
            }
        
        }
        
        System.out.println("Number of numbers: " + numInputs);
    }
}
