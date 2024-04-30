
import java.util.Scanner;

public class Reprint {
    
    // Expand the previous program so that the main program asks the user for the number of times the phrase will be printed.

    public static void main(String[] args) {
        // ask the user for how many times should the text be printed
        // then call the printText-method multiple times with a while-loop
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("How many times?");
        int n1 = Integer.valueOf(scanner.nextLine());
        
        for(int aux = 1; aux <= n1; aux++) {
            printText();
        }
    }
    
    // Don't change the next line that defines the method!
    // (We aren't giving a method a parameter yet)
    public static void printText() {
        System.out.println("In a hole in the ground there lived a method");
    }
}
