
public class Program {

    public static void main(String[] args) {
    // Using the Karvonen method
    // Create a class called Fitbyte. Its constructor takes both an age and a resting heart rate as its parameters. 
    // The exercise assistant should provide a method targetHeartRate, which is passed a number of type double as a 
    // parameter that represents a percentual portion of the maximum heart rate. 
    // The proportion is given as a number between zero and one.
        
        Fitbyte fitbyte = new Fitbyte(30, 60);

        double percentage = 0.5;
        
        while (percentage < 1.0) {
            double target = fitbyte.targetHeartRate(percentage);
            System.out.println("Target " + (percentage * 100) + "% of maximum: " + target);
            percentage += 0.1;
        }
    }
}
