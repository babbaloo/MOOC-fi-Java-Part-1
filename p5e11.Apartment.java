
public class Apartment {

    private int rooms;
    private int squares;
    private int pricePerSquare;
    private int price;
   
    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.pricePerSquare = pricePerSquare;
        this.price = this.squares * this.pricePerSquare;
    }
    
    public boolean largerThan(Apartment compared) {
        if (this.squares > compared.squares) {
            return true;
        }
        return false;
    }
    
    public int priceDifference(Apartment compared) {
        return Math.abs(this.price - compared.price);
    }
    
    public boolean moreExpensiveThan(Apartment compared) {
        if (this.price > compared.price) {
            return true;
        }
        return false;
    }

}
