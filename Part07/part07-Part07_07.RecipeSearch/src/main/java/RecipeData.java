
import java.util.ArrayList;


/**
 *
 * @author ichla
 */
public class RecipeData {
    private String name;
    private int cookingTime;
    private ArrayList<String> ingredients;
    
    public RecipeData(String name, int cookingTime, ArrayList<String> ingredients) {
        this.name = name;
        this.cookingTime = cookingTime;
        this.ingredients = new ArrayList<>(ingredients);
    }

    public String getName() {
        return this.name;
    }

    public int getCookingTime() {
        return this.cookingTime;
    }

    public ArrayList<String> getIngredients() {
        return ingredients;
    }
    
    public String toString() {
        return this.name + ", cooking time: " + this.cookingTime + " " + getIngredients();
    }
}
