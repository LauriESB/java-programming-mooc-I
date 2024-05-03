import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    
    // Write a program that first reads book information from the user. 
    // The details to be asked for each book include the title, the number of pages and the publication year. 
    // Entering an empty string as the name of the book ends the reading process.
    // After this the user is asked for what is to be printed. 
    // If the user inputs "everything", all the details are printed: the book titles, the numbers of pages and the publication years. However, if the user enters the string "name", only the book titles are printed.
    // There are two points in total available for this exercise.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        
        while(true) {
            System.out.println("Title: ");
            String title = scanner.nextLine();
            
            if(title.isEmpty()) {
                break;
            }

            System.out.println("Pages: ");
            int numOfPages = Integer.valueOf(scanner.nextLine());

            System.out.println("Publication year: ");
            int pubYear = Integer.valueOf(scanner.nextLine());
            
            books.add(new Book(title, numOfPages, pubYear));
        }
        
        System.out.println("What information will be printed?");
        String info = scanner.nextLine();
        
         
        if(info.equals("everything")) {
            for(Book dataBooks : books) {
                System.out.println(dataBooks);
            }
        }else if(info.equals("name")) {
            for(Book dataBooks : books) {
                System.out.println(dataBooks.getTitle());
            }
        }  
    }
}
