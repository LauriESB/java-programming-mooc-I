
import java.util.ArrayList;
import java.util.Scanner;

public class AgeOfTheOldest {
    
    // Write a program that reads names and ages from the user until an empty line is entered. 
    // The name and age are separated by a comma.
    // After reading all user input, the program prints the age of the oldest person. 
    // You can assume that the user enters at least one person, and that one of the users is older than the others.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int age, aux = 0;
        while (true) {
            String namesAndAges = scanner.nextLine();
            if (namesAndAges.equals("")) {
                break;
            }
            
            String[] parts = namesAndAges.split(",");
            age = Integer.valueOf(parts[1]);
            
            if(age > aux){
                aux = age;
            }
        }    
            System.out.println(aux);
        
       
    }
}
