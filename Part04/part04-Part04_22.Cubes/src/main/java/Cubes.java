import java.util.Scanner;

public class Cubes {
    
    // Write a program that reads strings from the user until the user inputs the string "end". 
    // As long as the input is not "end", the program should handle the input as an integer and 
    // print the cube of the number provided (i.e., number _ number _ number). Below are some sample outputs

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while(true) {
            String string = scanner.nextLine();
            
            if(string.equals("end")) {
                break;
            }
            
            int cubeOfNumber = Integer.valueOf(string);
            cubeOfNumber = cubeOfNumber * cubeOfNumber * cubeOfNumber;
            System.out.println(cubeOfNumber);
        }

    }
}
