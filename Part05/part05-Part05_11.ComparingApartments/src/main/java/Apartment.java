
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;
    private int thisPrice;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
        thisPrice = this.squares * this.princePerSquare;
    }

    public boolean largerThan(Apartment compared) {
        return (this.squares > compared.squares) ? true : false;
    }
    
    public int comparedPrice(Apartment compared) {
        return compared.princePerSquare * compared.squares;
    }

    public int priceDifference(Apartment compared) {
        return Math.abs(thisPrice - comparedPrice(compared));
    }
    
    public boolean moreExpensiveThan(Apartment compared) {
        return (thisPrice > comparedPrice(compared)) ? true : false;
    }
}
