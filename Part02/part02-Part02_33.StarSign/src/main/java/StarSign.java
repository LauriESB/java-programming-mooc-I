
public class StarSign {

    public static void main(String[] args) {

    // Define a method called printStars that prints the given number of stars and a line break.
    // Define a method called printSquare(int size) that prints a suitable square with the help of the printStars method.
    // Write a method called printRectangle(int width, int height) that prints the correct rectangle by using the printStars method.
    // Create a method called printTriangle(int size) that prints a triangle by using the printStars method.
        
        
        printStars(3);
        System.out.println("\n---");
        // printing --- between the shapes
        printSquare(4);
        System.out.println("\n---");
        
        printRectangle(5, 6);
        System.out.println("\n---");
        
        printTriangle(3);
        System.out.println("\n---");
    }

    public static void printStars(int number) {
        int aux = 1;
        while(aux <= number) {
            System.out.print("*");
            aux++;
        }
        System.out.println("");
    }

    public static void printSquare(int size) {
        int aux = 1;
        int sum = 0;
        
        for(int i = 1; i <= size; i++) {
            printStars(size);
        }
        System.out.println("");
    }

    public static void printRectangle(int width, int height) {
        for(int i = 1; i  <= height; i++) {
            printStars(width);
        
        }
    }

    public static void printTriangle(int size) {
        int aux = 0;
        for(int i = 1; i <= size; i++) {
            printStars(aux + 1);
            aux += 1;
        }
    }
}
