
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    
    // Modify the program so that books that are already on the list are not added to it again. 
    // Two books should be considered the same if they have the same name and publication year.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();

        while (true) {
            System.out.println("Name (empty will stop):");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }
           
            System.out.println("Publication year:");
            int publicationYear = Integer.valueOf(scanner.nextLine());
            Book book = new Book(name, publicationYear);
            
            if(!(books.contains(book))) {
                books.add(book);
            } else{
                System.out.println("Book is already on the list. It won't be added");
            }
        }
        
        // NB! Don't alter the line below!
        System.out.println("Thank you! Books added: " + books.size());
    }
}
