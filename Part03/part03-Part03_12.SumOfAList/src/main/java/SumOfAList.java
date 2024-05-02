import java.util.ArrayList;
import java.util.Scanner;

public class SumOfAList {
    
    // Modify the program so that after reading the numbers it calculates and prints the sum of the numbers in the list.

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
        int sum = 0;
        for(int i = 0; i < list.size(); i++) {
            int numbers = list.get(i);
            sum += numbers;
        }
        System.out.println("Sum " + sum);

        // toteuta listan lukujen summan laskeminen tänne
    }
}
