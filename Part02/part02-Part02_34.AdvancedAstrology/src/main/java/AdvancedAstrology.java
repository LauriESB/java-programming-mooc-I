
public class AdvancedAstrology {
    
    // CREATE A CHRISTMAS TREE
    // Define a method called printSpaces(int number) that produces the number of spaces specified by number. The method does not print the line break.
    // Create a method called printTriangle(int size) that uses printSpaces and printStars to print the correct triangle. 
    // Define a method called christmasTree(int height) that prints the correct Christmas tree. The Christmas tree consists of a triangle with the specified height as well as the base. The base is two stars high and three stars wide, and is placed at the center of the triangle's bottom. The tree is to be constructed by using the methods printSpaces and printStars. 
    // For example, the call christmasTree(4) should print the following:
    
    
    public static void printStars(int number) {
        for(int i = 0; i < number; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }

    public static void printSpaces(int number) {
        for(int i = 1; i <= number; i++) {
            System.out.print(" ");
        }
       
    }

    public static void printTriangle(int size) {
        int aux = 0;
        int spaces = size;
        for(int i = 0; i < size; i++) {
            printSpaces(spaces - 1);
            printStars(aux + 1);
           
            aux++;
            spaces--;
        }
    }

    public static void christmasTree(int height) {
        int spaces = height - 1;
        int aux = 1;
       
        for(int i = 0; i < height;i++) {
            printSpaces(spaces);
            spaces--;
            printStars((aux * 2) - 1);
            
            
            aux++;
        }
        for(int i = 0; i < 2; i++) {
            printSpaces(height - 2);
            printStars(3);
        }
        
        
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.
        //printTriangle(5);
        //System.out.println("---");
        printTriangle(3);
        //christmasTree(4);
        //System.out.println("---");
        //christmasTree(10);
    }
}
