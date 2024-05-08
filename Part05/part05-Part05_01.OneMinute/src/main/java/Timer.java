/**
 *
 * @author LauriESB
 */
public class Timer {
    private int seconds;
    private int hundredsOfSeconds;
    
    public Timer() {
        this.seconds = 0;
        this.hundredsOfSeconds = 0;
    }
    public void advance() {
        this.hundredsOfSeconds += 1;
        
        if(this.hundredsOfSeconds >= 100) {
            this.hundredsOfSeconds = 0;
            this.seconds ++;
            if(this.seconds >= 60) {
                this.seconds = 0;
            }
        }
    
    }
    public String checkSeconds() {
        if(this.seconds < 10) {
            return "0" + this.seconds;
        }else{
            return "" + this.seconds;
        }
    }
    public String checkHundreds() {
        if(this.hundredsOfSeconds < 10) {
            return "0" + this.hundredsOfSeconds;
        }else{
            return "" + this.hundredsOfSeconds;
        }
    }

    public String toString() {
        return checkSeconds() + ":" + checkHundreds();
    
    }
}
