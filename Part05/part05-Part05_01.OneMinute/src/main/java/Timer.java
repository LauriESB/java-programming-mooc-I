/**
 *
 * @author LauriESB
 */
public class Timer {
    private ClockHand seconds;
    private ClockHand hundredsOfSeconds;
    
    public Timer() {
        this.seconds = new ClockHand(60);
        this.hundredsOfSeconds = new ClockHand(100);
    }
    public void advance() {
        this.hundredsOfSeconds.advance();
        
        if(this.hundredsOfSeconds.value() == 0) {
            this.seconds.advance();
        }
    
    }
    public String toString() {
        return seconds.toString() + ":" + hundredsOfSeconds.toString();
    
    }
}
