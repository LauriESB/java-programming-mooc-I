
import java.util.Scanner;

public class CarryOn {

    public static void main(String[] args) {
        
        // Write a program by using the loop example that asks "Shall we carry on?" 
        // until the user inputs the string "no".
        
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("Shall we carry on?");
            String answer = scanner.nextLine();
            if(answer.equals("no")){
                break;
            }
        }
    }
}
