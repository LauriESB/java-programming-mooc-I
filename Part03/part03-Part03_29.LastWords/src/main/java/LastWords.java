
import java.util.Scanner;

public class LastWords {
    
    // Write a program that reads user input until an empty line is entered. 
    // For each non-empty line the program splits the string by spaces and prints the last part of the string.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            
            String word = scanner.nextLine();
            
            if(word.equals("")) {
                break;
            }
            
            String[] parts = word.split(" ");
            System.out.println(parts[parts.length - 1]);
        
        }

    }
}
