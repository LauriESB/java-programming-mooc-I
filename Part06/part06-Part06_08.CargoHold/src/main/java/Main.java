
public class Main {

    public static void main(String[] args) {
        // This exercise has 7 parts. I'll leave the especifications after the aplication's test
        
        Item book = new Item("Lord of the rings", 2);
        Item phone = new Item("Nokia 3210", 1);
        Item brick = new Item("brick", 4);

        Suitcase suitcase = new Suitcase(10);
        suitcase.addItem(book);
        suitcase.addItem(phone);
        suitcase.addItem(brick);

        System.out.println("The suitcase contains the following items:");
        suitcase.printItems();
        System.out.println("Total weight: " + suitcase.totalWeight() + " kg");
        Item heaviest = suitcase.heaviestItem();
        System.out.println("Heaviest item: " + heaviest);
        
        Suitcase adasCase = new Suitcase(10);
        adasCase.addItem(book);
        adasCase.addItem(phone);

        Suitcase pekkasCase = new Suitcase(10);
        pekkasCase.addItem(brick);

        Hold hold = new Hold(1000);
        hold.addSuitcase(adasCase);
        hold.addSuitcase(pekkasCase);

        System.out.println(hold);
        System.out.println("The suitcases in the hold contain the following items:");
        hold.printItems();
        
        // Part01. 
        // Create an Item class from which objects can be instantiated to represent different items. The information to store is the name and weight of the item (kg).
        // Add the following methods to the class:
        // Constructor that takes the name and the weight of the item as parameters
        // Method public String getName(), which returns the item's name
        // Method public int getWeight(), which returns the item's weight
        // Method public String toString(), which returns the string "name (weight kg)"

        // Part02.
        // Create a Suitcase class. The suitcase has items and a maximum weight that determines the maximum total weight of the items.
        // Add the following methods to the class:
        // Constructor, to which the maximum weight is provided
        // The method public void addItem(Item item), which adds the item passed as a parameter to the suitcase. The method does not return a value.
        // The method public String toString(), which returns the string "x items (y kg)"

        // Part03.
        // The statement "1 items" is not exactly proper English — a better form would be "1 item". The lack of items could also be expressed as "no items". 
        // Implement this change to the toString method of the Suitcase class.
        
        // Part04. 
        // Add the following methods to the Suitcase class:
        // a printItems method, which prints all the items in the suitcase
        // a totalWeight method, which returns the total weight of the items
        
        // Part05.
        // Add to the Suitcase class a heaviestItem method
        
        // Part06.
        // Make a Hold class with the following methods:
        // a constructor, to which the maximum weight is given
        // method public void addSuitcase(Suitcase suitcase) that adds the specified luggage to the hold
        // method public String toString() that returns the string "x suitcases (y kg)"

        // Part07.
        // Add to the Hold class the method public void printItems() 
    }

}
