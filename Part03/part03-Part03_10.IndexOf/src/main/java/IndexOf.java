import java.util.ArrayList;
import java.util.Scanner;

public class IndexOf {
    
    // Expand the program by adding a functionality that asks the user for a number, and reports that number's index in the list. 
    // If the number is not found, the program should not print anything.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }

        System.out.println("Search for? ");
        int n1 = Integer.valueOf(scanner.nextLine());
        
        for(int i = 0; i < list.size(); i++) {
            int number = list.get(i);
            if(number == n1) {
                int index = i;
                System.out.println(n1 + " is at index " + index);
            } 
            
        }
        

        // implement here finding the indices of a number
    }
}
