

public class FromOneToParameter {
    
    // Create the following method in the exercise template: public static void printUntilNumber(int number). 
    // It should print the numbers from one to the number passed as a parameter.

    public static void main(String[] args) {
        printUntilNumber(5);
    }
    public static void printUntilNumber(int number) {
        int i = 1;
        while (i <= number) {
            System.out.println(i);
            i++;
        }
   
    }
}
