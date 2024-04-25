import java.util.Scanner;

public class AreWeThereYet {

    public static void main(String[] args) {
        
        // Write a program, according to the preceding example, 
        // that asks the user to input values until they input the value 4.
        
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());

            if (number == 4) {
                break;
            }
        }
    }
}
