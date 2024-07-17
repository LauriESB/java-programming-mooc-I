
/**
 *
 * @author ichla
 */
public class Container {

    private int firstContainer;
    private int secondContainer;

    public Container() {
        this.firstContainer = 0;
        this.secondContainer = 0;
    }

    public int contains() {
        return firstContainer;
    }

    public void add(int amount) {
        if (amount < 0) {
            firstContainer += 0;
        } else if (firstContainer + amount > 100) {
            firstContainer = 100;
        } else {
            firstContainer += amount;
        }
    }

    public void remove(int amount) {
        if (amount < 0) {
            secondContainer -= 0;
        } else if (amount > secondContainer) {
            secondContainer = 0;
        } else {
            secondContainer -= amount;
        }
    }

    public void move(int amount) {
        if (amount + secondContainer > 100) {
            firstContainer -= amount;
            secondContainer = 100;

        } else if (amount > firstContainer) {
            if (secondContainer + firstContainer < 100) {
                secondContainer += firstContainer;
                firstContainer = 0;
            } else {
                secondContainer = 100;
                firstContainer = 0;
            }
        } else {
            firstContainer -= amount;
            secondContainer += amount;

        }
    }

    public String toString() {
        return "First: " + firstContainer + "/100\n" + "Second: " + secondContainer + "/100";
    }
}
