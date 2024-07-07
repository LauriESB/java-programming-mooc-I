
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
        if(this.squares > compared.squares) {
            return true;
        }
        return false;
    }
    
    public int priceDifference(Apartment compared) {
        int valueCompared = compared.princePerSquare * compared.squares;
        
        if(thisPrice >= valueCompared) {
            //moreExpensiveThan(this);
            return thisPrice - valueCompared;
        }
        //moreExpensiveThan(compared);
        return valueCompared - thisPrice;
    }
    
    public boolean moreExpensiveThan(Apartment compared) {
        int valueCompared = compared.princePerSquare * compared.squares;
        
        if(thisPrice > valueCompared) {
            return true;
        }
        return false;
    }
}
