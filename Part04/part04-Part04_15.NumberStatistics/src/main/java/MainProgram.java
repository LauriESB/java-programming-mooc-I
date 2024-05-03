import java.util.Scanner;

public class MainProgram {
    
    // This exercise is dividade in 4 parts:
    // Part01.Count
    // Part02.Sum and average
    // Part03.Sum of user input
    // Part04.Multiple sums

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Statistics sum = new Statistics();
        Statistics sumOfEven = new Statistics();
        Statistics sumOfOdd = new Statistics();
    
        while(true) {
            System.out.println("Enter numbers:");
            int n1 = Integer.valueOf(scanner.nextLine());
            
            if(n1 == -1) {
                break;
            }
            
            if(n1 % 2 == 0) {
                sumOfEven.addNumber(n1);
            }else{
                sumOfOdd.addNumber(n1);
            }
            sum.addNumber(n1);
        }
        System.out.println("Sum: " + sum.sum());
        System.out.println("Sum of even numbers: " + sumOfEven.sum());
        System.out.println("Sum of odd numbers: " + sumOfOdd.sum());
        
    }
}
