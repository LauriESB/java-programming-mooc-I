
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ichla
 */
public class Recipe {

    private ArrayList<RecipeData> listRecipe;

    public Recipe() {
        this.listRecipe = new ArrayList<>();
    }

    public void addRecipe(String file) {

        try ( Scanner scannerPath = new Scanner(Paths.get(file))) {
            while (scannerPath.hasNextLine()) {
                String name = scannerPath.nextLine();
                int time = Integer.valueOf(scannerPath.nextLine());
                ArrayList<String> recipes = new ArrayList<>();

                while (scannerPath.hasNextLine()) {
                    String ingredient = scannerPath.nextLine();
                    
                    if (ingredient.isEmpty()) {
                        break;
                    }
                    recipes.add(ingredient);
                }
                RecipeData rdata = new RecipeData(name, time, recipes);
                listRecipe.add(rdata);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

    public void listRecipe(String file) {
        System.out.println("Recipes:");
        for (RecipeData percorre : listRecipe) {
            System.out.println(percorre);
        }
    }

    public void findName(Scanner scanner) {
        boolean found = false;
        System.out.println("Searched word");
        String word = scanner.nextLine();

        System.out.println("Recipes");
        for (RecipeData percorre : listRecipe) {
            if (percorre.getName().toLowerCase().contains(word)) {

                System.out.println(percorre);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No recipes found with the given word.");
        }
    }

    public void findCookingTime(Scanner scanner) {
        System.out.println("Max cooking time: ");
        int time = Integer.valueOf(scanner.nextLine());
        boolean found = false;

        System.out.println("Recipes");
        for (RecipeData percorre : listRecipe) {
            if (percorre.getCookingTime() <= time) {
                found = true;

                System.out.println(percorre);
            }
        }
        if (!found) {
            System.out.println("No recipes found within that max cooking time");
        }
    }

    public void findIngredient(Scanner scanner) {
        System.out.println("Ingredient: ");
        String ingredient = scanner.nextLine();
        boolean found = false;
        
        System.out.println("Recipes");
        for (RecipeData percorre : listRecipe) {
            for (String per : percorre.getIngredients()) {
                if (per.equalsIgnoreCase(ingredient)) {
                    System.out.println(percorre);
                    found = true;  
                }
            }
        }
        if (!found) {
            System.out.println("No recipes found with the given ingredient.");
        }
    }

}
