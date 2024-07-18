
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Points points = new Points();

        // Write your program here -- consider breaking the program into 
        // multiple classes.
        while (true) {
            System.out.println("Enter point totals, -1 stops: ");
            int value = Integer.valueOf(scanner.nextLine());

            if (value == -1) {
                break;
            }

            points.addPoints(value);

        }
        System.out.println(points);
        points.calcGradeDistribution();
    }
}
