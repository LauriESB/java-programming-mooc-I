public class MainProgram {
    
    // This exercise consists of multiple parts. Each part corresponds to one exercise point.
    // The exercise template comes with a partially executed class decreasingCounter.
    // Part01. Implementation of the decrement() method
    // Part02. The counter's value cannot be negative
    // Part03. Resetting the counter value

    public static void main(String[] args) {
        DecreasingCounter counter = new DecreasingCounter(100);

        counter.printValue();
        counter.reset();
        counter.printValue();
        
        counter.decrement();
        counter.printValue();
        
    }
}
