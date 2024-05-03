import java.util.Scanner;

public class NumberOfStrings {
    
    // Write a program that reads strings from the user until the user inputs the string "end". 
    // At that point, the program should print how many strings have been read. 
    // The string "end" should not be included in the number strings read. 

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int aux = 0;
        
        while(true) {
            String string = scanner.nextLine();
            
            if(string.equals("end")) {
                break;
            }
            
            aux += 1;
        }
        System.out.println(aux);
    }
}
