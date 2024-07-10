
public class Main {

    public static void main(String[] args) {
        // We'll practise wrapping gifts in this exercise. Let's create the classes Gift and Package. 
        // The gift has a name and weight, and the package contains gifts.

        // use this main method to try out your classes!
        Gift book = new Gift("Harry Potter and the Philosopher's Stone", 2);

        System.out.println("Gift's name: " + book.getName());
        System.out.println("Gift's weight: " + book.getWeight());

        System.out.println("Gift: " + book);
        
        Package gifts = new Package();
        gifts.addGift(book);
        System.out.println(gifts.totalWeight());
    }
}
