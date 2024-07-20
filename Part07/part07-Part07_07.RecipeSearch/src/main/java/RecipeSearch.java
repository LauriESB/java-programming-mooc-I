
import java.io.File;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        // You may assume that the user only enters files that exist.
        
        // Part01. First create the functionality to read and list recipes.
        // Part02. Make it possible to find recipes by their names. 
        // Part03. Next, implement the possibility to find recipes based on their cooking time.
        //         The program should react by printing all the recipes whose cooking times don't exceed the cooking time given by the user 
        // Part04. Finally, add the functionality to search for recipes based on their ingredients.

        Scanner scanner = new Scanner(System.in);
        Recipe recipe = new Recipe();

        System.out.println("File to read: ");
        String file = scanner.nextLine();
        recipe.addRecipe(file);
        
        System.out.println("Commands: ");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");

        while (true) {

            System.out.println("Enter command");
            String command = scanner.nextLine();

            if (command.equals("stop")) {
                break;
            }

            if (command.equals("list")) {
                recipe.listRecipe(file);
            } else if (command.equals("find name")) {
                recipe.findName(scanner);
            } else if (command.equals("find cooking time")) {
                recipe.findCookingTime(scanner);
            } else if (command.equals("find ingredient")) {
                recipe.findIngredient(scanner);
            } else {
                System.out.println("not a command");
            }

        }

    }

}
