/**
 *
 * @author ichla
 */
public class Fitbyte {
  private int age;
  private int HRrest; // resting heart rate
    
  public Fitbyte(int age, int HRrest) {
    this.age = age;
    this.HRrest = HRrest;
  }
  
  // The target heart rate is calculated with the formula (maximum heart rate - resting heart rate) * (target heart rate percentage) + resting heart rate
  // Use the 206.3 - (0.711 * age) formula to calculate the maximum heart rate.
  
  public double targetHeartRate(double value) { // where the target heart rate is given as a percentage of the maximum heart rate.
    return ((206.3 - (0.711 * age)) - HRrest) * value + HRrest;
  }
}
