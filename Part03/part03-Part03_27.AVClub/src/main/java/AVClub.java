
import java.util.Scanner;

public class AVClub {
    
    // Write a program that reads user input until an empty line. 
    // For each non-empty string, the program splits the string by 
    // spaces  and then prints the pieces that contain av, each on a new line.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            String phrase = scanner.nextLine();
            String[] arrayPhrase1 = phrase.split(" ");
        
            if(phrase.equals("")) {
                break;
            }
            
            for(int i = 0; i < arrayPhrase1.length; i++) {
                if(arrayPhrase1[i].contains("av")) {
                    System.out.println(arrayPhrase1[i]);
                }
            }
        }  
    }
}
