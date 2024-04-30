

public class Division {

    // Write a method public static void division(int numerator, int denominator) 
    // that prints the result of the division of the numerator by the denominator.
    
    public static void main(String[] args) {
        division(3, 5);
    }

    public static void division(int numerator, int denominator) {
        double div = 1.0 * numerator / denominator;
        System.out.println(div);
    }
}
