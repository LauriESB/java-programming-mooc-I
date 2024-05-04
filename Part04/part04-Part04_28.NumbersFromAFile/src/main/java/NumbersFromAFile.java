
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class NumbersFromAFile {
    
    // Write a program that prompts the user for a filename, as well as the upper and lower bounds for the accepted range of numbers. 
    // Then the program reads the numbers contained in the file (each number is on its own line) and only accounts for the numbers which are inside the given range. 
    // Finally, the program should print the number of numbers that were inside the given range.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        int numbers = 0;
        
        System.out.println("File? ");
        String file = scanner.nextLine();
        System.out.println("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.println("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());
        
        try (Scanner readLines = new Scanner(Paths.get(file))) {
            while(readLines.hasNextLine()) {
                list.add(readLines.nextLine());
            }
        }catch(Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        for(String numString : list) {
            int numInt = Integer.valueOf(numString);
            if(numInt >= lowerBound && numInt <= upperBound) {
                numbers++;
            }
        }
        System.out.println("Numbers: " + numbers);
        
    }
}
