
import java.util.ArrayList;

/**
 *
 * @author ichla
 */
public class Suitcase {

    private ArrayList<Item> items;
    private int maximumWeight;

    public Suitcase(int maximumWeight) {
        this.maximumWeight = maximumWeight;
        this.items = new ArrayList<>();
    }

    public int totalWeight() {
        int weight = 0;

        for (Item percorre : items) {
            weight += percorre.getWeight();
        }
        return weight;
    }

    public void addItem(Item item) {
        if (this.totalWeight() + item.getWeight() <= maximumWeight) {
            items.add(item);
        }
    }
    
    public void printItems(){
        for(Item percorre : items) {
            System.out.println(percorre);
        }
    }
    
    public Item heaviestItem() {
        if(this.items.isEmpty()) {
            return null;
        }
        Item checkHeaviest = items.get(0);
        
        for(Item percorre : items) {
            if(checkHeaviest.getWeight() <= percorre.getWeight()) {
                checkHeaviest = percorre;
            }
        }
        return checkHeaviest;
    }
    
    public String toString() {
        String s = "";
        if (this.items.size() > 1) {
            s = "s";
        }

        if (this.items.size() == 0) {
            return "no items" + "(" + this.totalWeight() + " kg)";
        }
        return this.items.size() + " item" + s + "(" + this.totalWeight() + " kg)";
    }
}
