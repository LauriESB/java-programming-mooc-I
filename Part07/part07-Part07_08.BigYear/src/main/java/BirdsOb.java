
/**
 *
 * @author ichla
 */
public class BirdsOb {

    private String name;
    private String latinName;
    private int ob;

    public BirdsOb(String name, String latinName, int ob) {
        this.name = name;
        this.latinName = latinName;
        this.ob = ob;
    }

    public String getName() {
        return this.name;
    }

    public String getLatinName() {
        return this.latinName;
    }

    public void setOb(int value) {
        this.ob += value;
    }

    public int getOb() {
        return this.ob;
    }

    public String toString() {
        return this.name + "(" + this.latinName + "):" + this.ob;
    }
}
