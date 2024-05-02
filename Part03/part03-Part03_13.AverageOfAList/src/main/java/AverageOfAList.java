
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {
    
    // The exercise template contains a base that reads numbers from the user and adds them to a list. Reading is stopped once the user enters the number -1.
    // When reading ends, calculate the average of the numbers in it, and then print that value.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> integerList = new ArrayList<>();
        
        while(true) {
            int n1 = Integer.valueOf(scanner.nextLine());
            
            if(n1 == -1) {
                break;
            }
            integerList.add(n1);
        }
        
        int sum = 0;
        int times = 0;
        
        for(int i = 0; i < integerList.size(); i++) {
            int number = integerList.get(i);
            sum += number;
            times++;
        }
        
        System.out.println("Average: " + (1.0 * sum/times));
        
    }
}
