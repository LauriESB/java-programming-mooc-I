
import java.util.Scanner;

/**
 *
 * @author ichla
 */
public class UserInterface {

    private JokeManager jm;
    private Scanner scanner;

    public UserInterface(JokeManager jm, Scanner scanner) {
        this.jm = jm;
        this.scanner = scanner;
    }

    public void start() {

        while (true) {
            System.out.println("Commands");
            System.out.println("1 - Add a joke");
            System.out.println("2 - Draw a joke");
            System.out.println("3 - List jokes");
            System.out.println("X - Stop");
            String op = scanner.nextLine();

            if (op.equals("X")) {
                break;
            }

            if (op.equals("1")) {
                System.out.println("Write the joke to be added:");
                String addJoke = scanner.nextLine();
                jm.addJoke(addJoke);
            } else if (op.equals("2")) {
                System.out.println(jm.drawJoke());
            } else if (op.equals("3")) {
                System.out.println("Printing the jokes.");
                jm.printJokes();
            }
        }

    }
}
