
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // Part01.
        // Create a Stack class that has a list of strings as an instance variable. Add the following methods to the class:
        // public boolean isEmpty() - returns a boolean-type value (true or false) that tells whether or not the stack is empty.
        // public void add(String value) - Adds the value given as a parameter to the top of the stack.
        // public ArrayList<String> values() - returns the values ​​contained in the stack as a list.

        // Part02.
        // Add to the Stack class a public String take() method, which returns the topmost value (i.e., the last value added to the deque) and removes it from the stack.
        Stack s = new Stack();
        
        System.out.println(s.isEmpty());
        System.out.println(s.values());
        s.add("Value");
        System.out.println(s.isEmpty());
        System.out.println(s.values());
        String taken = s.take();
        System.out.println(s.isEmpty());
        System.out.println(s.values());
        System.out.println(taken);

        Stack st = new Stack();
        st.add("1");
        st.add("2");
        st.add("3");
        st.add("4");
        st.add("5");

        while (!s.isEmpty()) {
            System.out.println(st.take());
        }
    }
}
