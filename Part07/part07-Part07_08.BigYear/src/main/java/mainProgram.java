
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {
        // NB! Do not create other scanner objects than the one below
        // if and when you create other classes, pass the scanner to them
        // as a parameter

        // The program must implement the following commands:
        // Add - adds a bird
        // Observation - adds an observation
        // All - prints all birds
        // One - prints one bird
        // Quit - ends the program


        Scanner scan = new Scanner(System.in);
        BirdsData bird = new BirdsData();

        while (true) {
            System.out.println("Add - adds a bird");
            System.out.println("Observation - adds an observation");
            System.out.println("All - prints all birds");
            System.out.println("One - prints one bird");
            System.out.println("Quit - ends the program");
            String command = scan.nextLine();

            if (command.equals("Quit")) {
                break;
            }

            if (command.equals("Add")) {
                bird.addBird(scan);
            } else if (command.equals("Observation")) {
                bird.birdCreateObservation(scan);
            } else if (command.equals("All")) {
                bird.printAll();
            } else if (command.equals("One")) {
                bird.printOneBird(scan);
            }
        }
    }

}
