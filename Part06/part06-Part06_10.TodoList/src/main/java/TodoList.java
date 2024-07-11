
import java.util.ArrayList;

/**
 *
 * @author ichla
 */
public class TodoList {
    private ArrayList<String> tasks;
    
    public TodoList() {
        tasks = new ArrayList<>();
    }
    public void add(String task) {
        tasks.add(task);
    }
    public void print() {
        int number = 0;
        for(String percorre : tasks) {
            number++;
            System.out.println(number + ": " + percorre);
        }
    }
    public void remove(int number) {
        tasks.remove(number - 1);
    }
    
}
