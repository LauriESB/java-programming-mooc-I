
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        
        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.
        
        // Part01 Implement a program that asks the user for numbers (the program first prints "Write numbers: ") until the user gives the number -1. When the user writes -1, the program prints "Thx! Bye!" and ends.
        // Part02 Extend the program so that it prints the sum of the numbers (not including the -1) the user has written.
        // Part03 Extend the program so that it also prints the number of numbers (not including the -1) the user has written.
        // Part04 Extend the program so that it prints the mean of the numbers (not including the -1) the user has written.
        // Part05 Extend the program so that it prints the number of even and odd numbers (excluding the -1).
        
        Scanner scanner = new Scanner(System.in);
       
        int sum = 0;
        int numOfNumbers = 0;
        int odd = 0;
        int even = 0;
        double avrg = 0;
        
        while (true) {
            System.out.println("Give numbers:");
            int n1 = Integer.valueOf(scanner.nextLine());
            
            if (n1 == -1) {
                break;
            } else {
                if(n1 % 2 != 0) {
                    odd += 1;
                } else {
                    even += 1;
                }
                
                sum += n1;
                numOfNumbers += 1;
                avrg = (double) sum / numOfNumbers;
                continue;
            }
        }
        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + numOfNumbers);
        System.out.println("Average: " + avrg);
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
        
    }
}
