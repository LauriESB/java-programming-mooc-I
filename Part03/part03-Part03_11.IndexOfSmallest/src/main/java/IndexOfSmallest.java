import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {
    
    // Write a program that reads numbers from the user. 
    // When number 9999 is entered, the reading process stops. After this the program will print the smallest number in the list, and also the indices where that number is found. 
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            ArrayList<Integer> integerList = new ArrayList<>();
            while(true) {
                int n1 = Integer.valueOf(scanner.nextLine());
                
                if(n1 == 9999) {
                    break;
                } 
                integerList.add(n1);
            }
            
            int smallest = integerList.get(0);
            for(int i = 0; i < integerList.size(); i++) {
                int number = integerList.get(i);
                if(number <= smallest) {
                    smallest = number;
                }
            }
            
            System.out.println("Smallest number: " + smallest);
            
            for(int aux = 0; aux < integerList.size(); aux++) {
                int number = integerList.get(aux);
                if(number == smallest) {
                    int index = aux;
                    System.out.println("Found at index: " + index);
                }
            }       
    }
}
