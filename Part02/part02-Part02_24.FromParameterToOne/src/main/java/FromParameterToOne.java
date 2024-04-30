

public class FromParameterToOne {

    // Create the following method in the exercise template: public static void printFromNumberToOne(int number). 
    // It should print the numbers from the number passed as a parameter down to one.
    
    public static void main(String[] args) {
        printFromNumberToOne(5);

    }
    public static void printFromNumberToOne(int number) {

        for (int i = number; i > 0; i--) {
            System.out.println(i);
        }
    }
}
