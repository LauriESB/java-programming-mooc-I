
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;
    int sum;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
        sum++;
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    public String toString() {
        String plural = "";
        String listOfElements = "";
        
        if (elements.isEmpty()) {
            return "The collection " + this.name + " is empty.";
        } else {
            if (sum > 1) {
                plural = "s";
            }
            for (String e : elements) {
                if (e.equals(elements.get(elements.size() - 1))) {
                    listOfElements += e;
                } else {
                    listOfElements += e + "\n";
                }

            }

            return "The collection " + this.name + " has " + sum + " element" + plural + ":\n" + listOfElements;

        }
    }
}
