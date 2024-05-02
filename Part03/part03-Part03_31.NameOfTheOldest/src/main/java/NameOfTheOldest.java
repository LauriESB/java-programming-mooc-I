import java.util.Scanner;

public class NameOfTheOldest {
    
    // Write a program that reads names and ages from the user until an empty line is entered. 
    // The name and age are separed by a comma.
    // After reading all user input, the program prints the name of the oldest person. 
    // You can assume that the user enters at least one person, and the that one of the users is older than the others.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int oldest, aux = 0;
        String name = "";
        
        while(true) {
            String namesAndAges = scanner.nextLine();
            if(namesAndAges.equals("")) {
                break;
            }
        
            String[] ages = namesAndAges.split(",");
            oldest = Integer.valueOf(ages[1]);
            
 
            if(oldest > aux) {
                aux = oldest;
                name = ages[0];
                
            }
        
        }
        System.out.println("Name of the oldest: " + name);

    }
}
