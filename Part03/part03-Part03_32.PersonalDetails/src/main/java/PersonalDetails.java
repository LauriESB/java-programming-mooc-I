import java.util.Scanner;

public class PersonalDetails {
    
    // Write a program that reads names and birth years from the user until an empty line is entered. 
    // The name and birth year are separated by a comma.
    // After that the program prints the longest name and the average of the birth years. 
    // If multiple names are equally longest, you can print any of them. You can assume that the user enters at least one person.

    public static void main(String[] args) {
        
        Scanner x = new Scanner(System.in);
        int sumYears = 0, qtdd = 0, aux = 0;
        String name = "";
        
        while(true) {
            String nameAndYear = x.nextLine();
            
            if(nameAndYear.equals("")) {
                break;
            }
            
            String[] parts = nameAndYear.split(",");
            
            if(parts[0].length() > aux) {
                aux = parts[0].length();
                name = parts[0];
            }
            
            sumYears += Integer.valueOf(parts[1]);
            qtdd++; 
        
        }
        System.out.println("Longest name: " + name);
        System.out.println("Average of the birth years: " + (1.0 * sumYears / qtdd));
    }
}
