
import java.util.ArrayList;

/**
 *
 * @author ichla
 */
public class Package {
    private ArrayList<Gift> gifts;
    
    public Package() {
        gifts = new ArrayList<>();
    }
    public void addGift(Gift gift) {
        gifts.add(gift);
    }
    public int totalWeight() {
        int totalWeight = 0;
        for(Gift percorre : gifts) {
            totalWeight += percorre.getWeight();
        }
        
        return totalWeight;
    }
}
