
public class MainProgram {

    public static void main(String[] args) {
        // implement a class called Counter
        // public Counter(int startValue) sets the start value of the counter to startValue.
        // public Counter() sets the start value of the counter to 0.

        // And the following methods:

        //  public int value() returns the current value of the counter
        //  public void increase() increases the value by 1
        //  public void decrease() decreases the value by 1

        // Implement versions which are given one parameter of the methods increase and decrease.

       // public void increase(int increaseBy) increases the value of the counter by the value of increaseBy. If the value of increaseBy is negative, the value of the counter does not change.

       // public void decrease(int decreaseBy) decreases the value of the counter by the value of decreaseBy. If the value of decreaseBy is negative, the value of the counter does not change.
       System.out.println("Constructor with a parameter");
       Counter c01 = new Counter(5);
       System.out.println("Current value of the counter: " + c01.value());
       c01.increase(3);
       c01.decrease(1);
       System.out.println(c01);
       
       System.out.println("\nConstructor without a parameter");
       Counter c02 = new Counter();
       System.out.println("Current value of the counter: " + c02.value());
       c02.increase(2);
       c02.decrease(3);
       System.out.println(c02); 
    }
}
