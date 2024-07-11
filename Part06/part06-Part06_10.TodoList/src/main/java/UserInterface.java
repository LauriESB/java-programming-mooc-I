
import java.util.Scanner;

/**
 *
 * @author ichla
 */
public class UserInterface {
    private Scanner scanner;
    private TodoList list;
    
    public UserInterface(TodoList list, Scanner scanner) {
        this.scanner = scanner;
        this.list = list;
    }
    
    public void start() {
        while(true) {
            System.out.println("Command: ");
            String command = scanner.nextLine();
            
            if(command.equals("stop")) {
                break;
            }
            
            if(command.equals("add")) {
                System.out.println("To add: ");
                String add = scanner.nextLine();
                list.add(add);
                continue;
            } else if (command.equals("list")) {
                list.print();
                continue;
            } else if (command.equals("remove")) {
                System.out.println("Which one is removed? ");
                int id = Integer.valueOf(scanner.nextLine());
                
                list.remove(id);
                continue;
            }
        
        }
    }
}
