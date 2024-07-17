
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container container = new Container();
        
        // Let's redo the previous program for handling two liquid containers. 
        // This time we'll create a class "Container", which is responsible for managing the contents of a container.
        
        while (true) {
            System.out.println(container);
            System.out.println("> ");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            
            String[] parts = input.split(" ");
            String command = parts[0];
            int value = Integer.valueOf(parts[1]);
            
            if(command.equals("add")) {
                container.add(value);
            } else if(command.equals("remove")) {
                container.remove(value);
            } else if(command.equals("move")) {
                container.move(value);
            }

        }
    }

}
