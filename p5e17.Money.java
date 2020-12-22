
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }
    
    public Money plus(Money addition) {
        Money newMoney = new Money(this.euros + addition.euros, this.cents + addition.cents);
        return newMoney;
    }
    
    public boolean lessThan(Money compared) {
        if (compared.euros > this.euros ||
            compared.euros == this.euros &&
            compared.cents > this.cents) {
            return true;
        }
        return false;      
    }
    
    public Money minus(Money decreaser) {
        int newEuros = this.euros - decreaser.euros;
        int newCents = decreaser.cents;
        if (newCents > 99) {
            newEuros -= newCents / 100;
            newCents %= 100;
        }
        if ((this.cents - newCents) < 0) {
            newCents = 100 - newCents;
            newEuros--;
        } else {
            newCents = this.cents - newCents;
        }
        if (newEuros < 0) {
            newEuros = 0;
            newCents = 0;
        }
        Money novaMoney = new Money(newEuros, newCents);
        return novaMoney;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

}
