
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Part01.
        // Implement the class TextUI that receives as constructor parameters a Scanner and SimpleDictionary objects. 
        // Then give the class a method called public void start().
        // The method asks the user for a command
        // If the command is end, the UI prints the string "Bye bye!" and the execution of the start method ends.
        // Otherwise the text UI prints the message Unknown command and asks for a new command, so it loops back to step 1.

        
        // Part02.
        // Modify the method public void start() so that it works in the following way:
        // If the command is add, the text UI asks the user for a word and a translation, each on its own line. 
        // After this the words are stored in the dictionary, and the method continues by asking for a new command (loops back to stage 1).
        
        // Part03.
        // If the command is search, the text UI asks the user for the word to be translated. 
        // After this it prints the translation of the word, and the method continues by asking for a new command (loops back to stage 1).
        
        // Part04.
        // Modify the searching functionality of the UI so that if the word isn't found (i.e. the dictionary returns null), the UI prints the message "Word (searched word) was not found".
        
        Scanner scanner = new Scanner(System.in);
        SimpleDictionary dictionary = new SimpleDictionary();
        
        TextUI ui = new TextUI(scanner, dictionary);
        ui.start();

    }
}
