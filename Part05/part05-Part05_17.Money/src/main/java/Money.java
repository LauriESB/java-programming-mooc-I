
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
        int neweuros = this.euros + addition.euros;
        int newcents = this.cents + addition.cents;

        Money NewAddMoney = new Money(neweuros, newcents);
        return NewAddMoney;
    }

    public boolean lessThan(Money compared) {
        if (this.euros == compared.euros) {
            if (this.cents > compared.cents) {
                return false;
            }
        }

        if (this.euros > compared.euros) {
            return false;
        }

        return true;
    }

    public Money minus(Money decreaser) {
        int thisEuros = this.euros;
        int thisCents = this.cents;

        int decEuros = decreaser.euros;
        int decCents = decreaser.cents;

        int minusEuros = 0;
        int minusCents = 0;

        if (thisEuros >= decEuros) {
            if (thisCents < decCents) {                
                thisCents = thisCents + 100;
                minusCents = thisCents - decCents;
                
                thisEuros--;
                minusEuros = thisEuros - decEuros;
            } else if (thisCents >= decCents) {
                minusCents = thisCents - decCents;
                minusEuros = thisEuros - decEuros;
            }
        } else {
            minusEuros = 0;
            minusCents = 0;
        }

        Money newMoneyObj = new Money(minusEuros, minusCents);
        return newMoneyObj;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + this.cents + zero + "e";
    }

}
