
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Searching {

    public static void main(String[] args) {
        // Part01. In the Main-class, implement a method public static int linearSearch(ArrayList<Book> books, int searchedId).
        // Part02. In the Main-class, implement a method public static int binarySearch(ArrayList<Book> books, int searchedId).

        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        System.out.println("How many books to create?");
        int numberOfBooks = Integer.valueOf(scanner.nextLine());
        for (int i = 0; i < numberOfBooks; i++) {
            books.add(new Book(i, "name for the book " + i));
        }

        System.out.println("Id of the book to search for?");
        int idToSearchFor = Integer.valueOf(scanner.nextLine());

        System.out.println("");
        System.out.println("Searching with linear search:");
        long start = System.currentTimeMillis();
        int linearSearchId = linearSearch(books, idToSearchFor);
        System.out.println("The search took " + (System.currentTimeMillis() - start) + " milliseconds.");
        if (linearSearchId < 0) {
            System.out.println("Book not found");
        } else {
            System.out.println("Found it! " + books.get(linearSearchId));
        }

        System.out.println("");

        System.out.println("");
        System.out.println("Searching with binary search:");
        start = System.currentTimeMillis();
        int binarySearchId = binarySearch(books, idToSearchFor);
        System.out.println("The search took " + (System.currentTimeMillis() - start) + " milliseconds.");
        if (binarySearchId < 0) {
            System.out.println("Book not found");
        } else {
            System.out.println("Found it! " + books.get(binarySearchId));
        }

    }

    public static int linearSearch(ArrayList<Book> books, int searchedId) {
        int bookValue = 0;

        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getId() == searchedId) {
                bookValue = i;
                return bookValue;
            }
        }
        return -1;

    }

    public static int binarySearch(ArrayList<Book> books, long searchedId) {
        // return the index it's located at
        int begin = 0;
        int end = books.size() - 1;
        
        while (begin <= end) {
            int middle = (end + begin) / 2;

            if (books.get(middle).getId() == searchedId) {
                return middle;
            } else if (searchedId > books.get(middle).getId() ) {
                begin = middle + 1;
            } else if (searchedId < books.get(middle).getId() ) {
                end = middle - 1;
            }

        }
        return -1;
    }
}
