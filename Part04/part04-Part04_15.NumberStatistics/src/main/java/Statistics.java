
public class Statistics {
    private int count;
    private int sum;
    
    public Statistics() {
        this.count = 0;
        this.sum = 0;
    }
    public void addNumber(int number) {
        this.count = this.count + 1;
        this.sum += number;
    }
    public int getCount(){
        return this.count;
    }
    public int sum(){
        return this.sum;
    }
    public double average() {
        if(getCount() == 0){
            return 0;
        }
        return (1.0 * sum()/getCount());
    }
    
}
