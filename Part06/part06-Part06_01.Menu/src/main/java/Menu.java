
import java.util.ArrayList;

public class Menu {

    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<>();
    }

    public void addMeal(String meal) {
        if (!(meals.contains(meal))) {
            meals.add(meal);
        }
    }

    public void clearMenu() {
        meals.removeAll(meals);
    }

    public void printMeals() {
        for (String percorre : meals) {
            System.out.println(percorre);
        }
    }
    // implement the required methods here
}
