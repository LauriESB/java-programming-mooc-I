
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        
        // This exercise is the first two-part exercise. When you complete both parts, you will get two exercise points.
        
        // Part01 Write a program which prints the integers from 1 to a number given by the user.
        // Part02 Ask the user for the starting point as well.
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Where to?");
        int finish = Integer.valueOf(scanner.nextLine());
        
        System.out.println("Where from?");
        int start = Integer.valueOf(scanner.nextLine());
        
        for(int aux = start; aux <= finish; aux++){
            if(finish >= start) {
                System.out.println(aux);
            }            
        }
    }
}
