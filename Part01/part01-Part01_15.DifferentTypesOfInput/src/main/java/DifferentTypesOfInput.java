
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give a string:");
        String text = scan.nextLine();
        
        System.out.println("Give an integer:");
        int integer = Integer.valueOf(scan.nextLine());
        
        System.out.println("Give a double:");
        double doub = Double.valueOf(scan.nextLine());
        
        System.out.println("Give a boolean:");
        boolean boo = Boolean.valueOf(scan.nextLine());
        
        System.out.println("You gave the string " + text);
        System.out.println("You gave the integer " + integer);
        System.out.println("You gave the double " + doub);
        System.out.println("You gave the boolean " + boo);
        
    }
}
