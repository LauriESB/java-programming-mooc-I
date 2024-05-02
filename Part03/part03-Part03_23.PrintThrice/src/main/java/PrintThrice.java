
import java.util.Scanner;

public class PrintThrice {
    
    // Write a program, that reads a string from the user and then prints it three times.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Give a word:");
        String word = scanner.nextLine();
        
        for(int i = 0; i < 3;i++) {
            System.out.print(word);
        }
    }
}
