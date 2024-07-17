
import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = {3, 1, 5, 99, 3, 12};

        // Part01. Create in the class MainProgram a class method smallest that takes an integer array as a parameter.
        System.out.println("\nPart 01");
        System.out.println("Smallest: " + MainProgram.smallest(array));

        // Part02. Create a method called indexOfSmallest in the class MainProgram.
        System.out.println("\nPart 02");
        System.out.println("Index of the smallest number: " + MainProgram.indexOfSmallest(array));

        // Part03. Create in the class MainProgram a class method called indexOfSmallestFrom.
        // It works similarly to the method in the previous section, but only considers the table values from a certain index forwards.
        System.out.println("\nPart 03");
        System.out.println(MainProgram.indexOfSmallestFrom(array, 0));
        System.out.println(MainProgram.indexOfSmallestFrom(array, 1));
        System.out.println(MainProgram.indexOfSmallestFrom(array, 2));

        // Part04. Create a class method swap in the class MainProgram. 
        // It receives as its parameters an array and two indices inside it. The method swaps the numbers in these indices with each other.
        System.out.println("\nPart 04");
        System.out.println(Arrays.toString(array));

        MainProgram.swap(array, 1, 0);
        System.out.println(Arrays.toString(array));

        MainProgram.swap(array, 0, 3);
       
        // Part05.
        System.out.println("\nPart 05");
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        MainProgram.sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }

    public static int smallest(int[] array) {
        int smallestValue = array[0];

        for (int percorre : array) {
            if (percorre < smallestValue) {
                smallestValue = percorre;
            }
        }
        return smallestValue;
    }

    public static int indexOfSmallest(int[] array) {
        int value = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == smallest(array)) {
                value = i;
            }
        }
        return value;
    }

    public static int indexOfSmallestFrom(int[] array, int startIndex) {
        int index = 0, smallestValue = array[startIndex];

        for (int i = startIndex; i < array.length; i++) {
            if (array[i] <= smallestValue) {
                smallestValue = array[i];
                index = i;
            }
        }

        return index;
    }

    public static void swap(int[] array, int index1, int index2) {
        int swap = array[index1];

        array[index1] = array[index2];
        array[index2] = swap;
        
    }

    public static void sort(int[] array) {
        int in = 0;

        for(int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array));
            swap(array, in, indexOfSmallestFrom(array, in));
            in++;
        }
    }
    
}
