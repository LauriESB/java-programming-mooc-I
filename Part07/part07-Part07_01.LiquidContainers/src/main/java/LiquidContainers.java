
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int firstContainer = 0, secondContainer = 0;

        while (true) {
            
            // The container can't hold more than a hundred liters and everything added past that will go to waste.
            
            System.out.println("First: " + firstContainer + "/100");
            System.out.println("Second: " + secondContainer + "/100");

            System.out.println("type add / move / remove and a value ");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);

            if (command.equals("add")) { // Part01. add amount adds the amount of liquid specified by the parameter to the first container.
                if (amount < 0) {
                    firstContainer += 0;
                } else if (firstContainer + amount > 100) {
                    firstContainer = 100;
                } else {
                    firstContainer += amount;
                }
            } else if (command.equals("move")) { // Part02. moves the amount of liquid specified by the parameter from the first container to the second container. 
                if (amount + secondContainer > 100) {
                    firstContainer -= amount;
                    secondContainer = 100;

                } else if (amount > firstContainer) {
                    if (secondContainer + firstContainer < 100) {
                        secondContainer += firstContainer;
                        firstContainer = 0;
                    } else {
                        secondContainer = 100;
                        firstContainer = 0;
                    }
                } else {
                    firstContainer -= amount;
                    secondContainer += amount;

                }

            } else if (command.equals("remove")) { // Part03. removes the amount of liquid specified by the parameter from the second container. 
                if(amount > secondContainer) {
                    secondContainer = 0;
                } else {
                    secondContainer -= amount;
                }
                
            }

        }
    }

}
