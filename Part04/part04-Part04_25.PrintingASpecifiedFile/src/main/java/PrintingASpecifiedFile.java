
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {
    
    // Write a program that asks the user for a string, and then prints the contents of a file with a name matching the string provided. 
    // You may assume that the user provides a file name that the program can find.
    // The exercise template contains the files "data.txt" and "song.txt", which you may use when testing the functionality of your program. 
    // The output of the program can be seen below for when a user has entered the string "song.txt". 
    // The content that is printed comes from the file "song.txt". Naturally, the program should also work with other filenames, assuming the file can be found.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Which file should have its contents printed?");
        String userInput = scanner.nextLine();
        
        try (Scanner fileFinder = new Scanner(Paths.get(userInput))) {
            
            while(fileFinder.hasNextLine()) {
                String row = fileFinder.nextLine();
                System.out.println(row);
            }
        
        }catch(Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
