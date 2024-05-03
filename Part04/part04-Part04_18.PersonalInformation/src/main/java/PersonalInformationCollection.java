import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        
        // The program described here should be implemented in the class PersonalInformationCollection. 
        // After the user has entered the last set of details (they enter an empty first name), exit the repeat statement.
        // Then print the collected personal information so that each entered object is printed in the following format: first and last names separated by a space (you don't print the identification number).

        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("Enter a name (empty ends the program):");
            String firstName = scanner.nextLine();
            
            if(firstName.isEmpty()) {
                break;
            }
            
            System.out.println("Enter a last name");
            String lastName = scanner.nextLine();
            
            System.out.println("Type id Number:");
            String idNumber = scanner.nextLine();
            
            infoCollection.add(new PersonalInformation(firstName, lastName, idNumber));
        }
        
        for(PersonalInformation person:infoCollection) {
            System.out.println(person.getFirstName() + " " + person.getLastName());
        }
    }
}
