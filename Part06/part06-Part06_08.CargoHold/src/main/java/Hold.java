
import java.util.ArrayList;

/**
 *
 * @author ichla
 */
public class Hold {
    private int maximumWeight;
    private ArrayList<Suitcase> suitcases;
    
    public Hold(int maximumWeight) {
        suitcases = new ArrayList<>();
        this.maximumWeight = maximumWeight;
    }
    
    public int totalWeight() {
        int weight = 0;
        for(Suitcase percorre : suitcases) {
            weight += percorre.totalWeight();
        }
        return weight;
    }
    
    public void addSuitcase(Suitcase suitcase) {
        if(this.totalWeight() + suitcase.totalWeight() <= this.maximumWeight) {
            suitcases.add(suitcase);
        }
    }
    
    public void printItems() {
        for(Suitcase percorre : suitcases) {
            percorre.printItems();
        }
    }
    
    public String toString() {
        String s = "";
        if(this.suitcases.size() > 1){
            s = "s";
        }
        return this.suitcases.size() + " suitcase" + s + "(" + totalWeight() + "kg)";
    }
}
