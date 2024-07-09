
import java.util.ArrayList;
/**
 *
 * @author ichla
 */

public class Stack {
    private ArrayList<String> stack;
    
    public Stack() {
        stack = new ArrayList<>();
    }
    public boolean isEmpty() {
        return stack.isEmpty();
    }
    public void add(String value) {
        stack.add(value);
    }
    public ArrayList<String> values() {
        return new ArrayList<>(stack);
    }
    public String take() {
        String value = stack.get(stack.size() - 1);
        stack.remove(value);
        return value;
    }
}
