
import java.util.Scanner;

public class Login {
    
    // The program either shows a personal message or informs of an incorrect username or password.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter username:");
        String userName = scanner.nextLine();
        
        System.out.println("Enter password:");
        String passWord = scanner.nextLine();
        
        if(userName.equals("alex")) {
            if(passWord.equals("sunshine")) {
                System.out.println("You have successfully logged in!");
            }else {  
                System.out.println("Incorrect username or password!");
            }
        
        }else if (userName.equals("emma")) {
            if(passWord.equals("haskell")) {
                System.out.println("You have successfully logged in!");
            }else {  
                System.out.println("Incorrect username or password!");
            }
        }
        
    }
}
