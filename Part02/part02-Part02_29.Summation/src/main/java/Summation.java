public class Summation {

    // Expand the method sum in the exercise template so that it calculates and returns the sum of the numbers that are given as the parameters.
 
    public static void main(String[] args) {
        int num1 = 4;
        int num2 = 3;
        int num3 = 6;
        int num4 = 1;
        
        int result = sum(num1, num2, num3, num4);
        System.out.println("Sum: " + result);
    }
    
    public static int sum(int num1, int num2, int num3, int num4) {
        int soma = num1 + num2 + num3 + num4;
        return soma;
    }

}
