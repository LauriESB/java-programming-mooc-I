
public class Main {

    public static void main(String[] args) {
        //Menu exactum = new Menu();

        // The menu object has an ArrayList as an instance variable to store the names of the dishes on the menu. The menu should provide the following methods:
        // public void addMeal(String meal) adds a meal to the menu. If the meal is already on the list, it should not be added again.
        // public void printMeals() prints the meals.
        // public void clearMenu() clears the menu.
        Menu menu = new Menu();
        menu.addMeal("Tofu ratatouille");
        menu.addMeal("Chilli coconut chicken");
        menu.addMeal("Chilli coconut chicken");
        menu.addMeal("Meatballs with mustard sauce");

        menu.printMeals();
        menu.clearMenu();

        System.out.println();
        menu.addMeal("Tomato and mozzarella salad");
        menu.printMeals();
    }
}
