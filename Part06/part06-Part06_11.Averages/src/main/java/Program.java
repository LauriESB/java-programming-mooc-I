
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        
        // Part01.
        // Create the method public double averageOfGrades() for the class GradeRegister. 
        // It should return the average of the grades. If the register contains no grades, the method should return -1. Use the grades list to calculate the average.
        
        // Part02.
        // Give the class GradeRegister a new object variable: a list where you will store the exam points every time that the method addGradeBasedOnPoints is called. 
        // After this addition, create a method public double averageOfPoints() that calculates and returns the average of the exam points. If there are no points added to the register, 
        // the method should return the number -1.
        
        // Part03.
        // As a final step, add the methods implemented above as parts of the user interface. When the program prints the grade distribution, it should also print the averages of the points and the grades.
        
        Scanner scanner = new Scanner(System.in);

        GradeRegister register = new GradeRegister();
        UserInterface ui = new UserInterface(register, scanner);
        ui.start();
    }
}
