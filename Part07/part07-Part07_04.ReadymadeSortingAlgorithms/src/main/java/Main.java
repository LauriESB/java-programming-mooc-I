
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;



public class Main {

    public static void main(String[] args) {
        // insert test code here
        int[] integerArray = {3, 1, 5, 99, 3, 12};
        ArrayList<Integer> listArray = new ArrayList<>();
        listArray.add(4);
        listArray.add(0);
        listArray.add(-2);
        listArray.add(78);
        
        System.out.println("Array of integers:");
        System.out.println(Arrays.toString(integerArray));
        sort(integerArray);
        System.out.println("Array of integers sorted:");
        System.out.println(Arrays.toString(integerArray));
        
        
        System.out.println("ArrayList of integers: ");
        System.out.println(listArray);
        System.out.println("ArrayList of integers sorted:");
        sortIntegers(listArray);
        System.out.println(listArray);
        
    }
    
    public static void sort(int[] array) {
        Arrays.sort(array);
    }
    
    public static void sort(String[] array) {
        Arrays.sort(array);
    }
    
    public static void sortIntegers(ArrayList<Integer> integers) {
        Collections.sort(integers);
    }
    
    public static void sortStrings(ArrayList<String> strings) {
        Collections.sort(strings);
    }

}
