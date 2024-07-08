
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Archive> archives = new ArrayList<>();

        while (true) {
            System.out.println("Identifier? (empty will stop)");
            String identifier = scanner.nextLine();

            if (identifier.isEmpty()) {
                break;
            }

            System.out.println("Name? Empty (empty will stop)");
            String name = scanner.nextLine();

            if (name.isEmpty()) {
                break;
            }
            Archive objArchive = new Archive(identifier, name);

            if (!(archives.contains(objArchive))) {
                archives.add(objArchive);
            }

        }

        System.out.println("\n==Items==");
        for (Archive percorre : archives) {
            System.out.println(percorre);
        }
    }
}
