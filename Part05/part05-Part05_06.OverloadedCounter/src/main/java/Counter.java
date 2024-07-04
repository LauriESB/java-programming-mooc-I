/**
 *
 * @author ichla
 */
public class Counter {
    private int counter;
    
    public Counter(int startValue) {
        counter = startValue;
    }
    public Counter() {
        this(0);
    }
    public int value() {
        return counter;
    }
    public void increase() {
        counter++;
    }
    public void decrease() {
        counter--;
    }
    
    public void increase(int increaseBy) {
        if(increaseBy > 0) {
            counter += increaseBy;
        }
    }
    public void decrease(int decreaseBy) {
        if(decreaseBy > 0) {
            counter -= decreaseBy;
        }
    }
    
    public String toString() {
        return "New Count Value: " + value();
    }
}
