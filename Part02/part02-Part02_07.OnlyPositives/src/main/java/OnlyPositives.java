
import java.util.Scanner;

public class OnlyPositives {

    public static void main(String[] args) {
        
        // Write a program that asks the user for numbers. If the number is negative 
        // (smaller than zero), the program prints for user "Unsuitable number" and asks 
        // the user for a new number. If the number is zero, the program exits the loop. 
        // If the number is positive, the program prints the number to the power of two.
        
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("Give a number: ");
            int n1 = Integer.valueOf(scanner.nextLine());
            
            if(n1 == 0) {
                break;
            }
     
            if(n1 < 0) {
                System.out.println("Unsuitable number");
                continue;
            }
            
            int power2 = n1*n1;
            System.out.println(power2);
        }
        
    }
}
