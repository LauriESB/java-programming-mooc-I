import java.util.ArrayList;
import java.util.Scanner;

public class RememberTheseNumbers {
    
    // Expand the functionality of the program so that after reading the numbers, it prints all the numbers received from the user. 
    // The number used to indicate stopping should not be printed.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();
        while (true) {
            int luku = Integer.valueOf(scanner.nextLine());
            if (luku == -1) {
                break;
            }
            
            numbers.add(luku);
        }
        for(int i = 0; i <= numbers.size() - 1; i++) {
            System.out.println(numbers.get(i));
        }

    }
}
