
import java.util.ArrayList;

public class RemoveLast {
    
    // Create the method public static void removeLast(ArrayList<String> strings) in the exercise template. 
    // The method should remove the last value in the list it receives as a parameter. 
    // If the list is empty, the method does nothing.

    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        
        strings.add("First");
        strings.add("Second");
        strings.add("Third");

        System.out.println(strings);

        removeLast(strings);
        removeLast(strings);

        System.out.println(strings);
    }
    public static void removeLast(ArrayList<String> strings) {
        if(strings.size() == 0) {
            return;
        }
       
        strings.remove(strings.size() - 1); 
        
        
        
    }
}
