import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // In the exercise template there is a ready-made class TelevisionProgram, representing a television program. 
        // The class has object variables name and duration, a constructor, and a few methods.
        // Implement a program that begins by reading television programs from the user. 
        // When the user inputs an empty string as the name of the program, the program stops reading programs.
        // After this the user is queried for a maximum duration. Once the maximum is given, the program proceeds to list all the programs whose duration is smaller or equal to the specified maximum duration.

        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("Name: ");
            String name = scanner.nextLine();
            
            if(name.isEmpty()) {
                break;
            }
            
            System.out.println("Duration: ");
            int duration = Integer.valueOf(scanner.nextLine());
        
            programs.add(new TelevisionProgram(name, duration));
        }
        
        System.out.println("Program's maximum duration? ");
        int maxDuration = Integer.valueOf(scanner.nextLine());
        
        for(TelevisionProgram movie : programs) {
            if (movie.getDuration() <= maxDuration) {
                System.out.println(movie);
            }
        }
    }
}
