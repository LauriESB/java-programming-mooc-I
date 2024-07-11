
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ichla
 */
public class TextUI {

    private Scanner scanner;
    private SimpleDictionary sd;

    public TextUI(Scanner scanner, SimpleDictionary sd) {
        this.scanner = scanner;
        this.sd = sd;
    }

    public void start() {

        while (true) {
            System.out.println("Command:");
            String command = scanner.nextLine();

            if (command.equals("end")) {
                System.out.println("Bye bye!");
                break;
            }
            
            if (command.equals("add")) {
                System.out.println("Word: ");
                String word = scanner.nextLine().trim();
                System.out.println("Translation: ");
                String translation = scanner.nextLine();
                sd.add(word, translation);
                continue;
            } else if(command.equals("search")) {
                System.out.println("To be translated: ");
                String translated = scanner.nextLine();
                
                if(!(sd.translate(translated) == null)) {
                    System.out.println("Translation: " + sd.translate(translated));
                    continue;
                } else {
                    System.out.println("Word " + translated + " was not found");
                    continue;
                }
            } else {
                System.out.println("Unknown command");
                continue;
            }
            
           
        }
    }
    
    

}
