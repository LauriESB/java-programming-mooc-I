
import java.util.Scanner;

public class Program {
    
    // The exercise template comes with the "ClockHand" class described above. 
    // Implement a Timer class based on the material's Clock class.
    // The timer has two hands, one for hundredths of a second and one for seconds. 
    // As it progresses, the number of hundredths of a second grows by one. 
    // When the hand corresponding to hundredths of a second reaches a value of 100, 
    // its value is set to zero, and the number of seconds grows by one. In the same way, 
    // when the value of the hand corresponding to seconds reaches the value of sixty, its value is set to zero.

    public static void main(String[] args) {
        // You can test your program here
        Timer timer = new Timer();

        while (true) {
            System.out.println(timer);
            timer.advance();

            try {
                Thread.sleep(10);
            } catch (Exception e) {

            }
        }

    }
}
