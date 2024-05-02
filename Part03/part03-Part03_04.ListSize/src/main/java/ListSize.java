
import java.util.ArrayList;
import java.util.Scanner;

public class ListSize {
    
    // In the exercise template is a program that reads input from the user. 
    // Modify its working so that when the program quits reading, the program prints the number of values on the list.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            list.add(input);
        }
        System.out.println("In total: " + list.size());
    }
}
