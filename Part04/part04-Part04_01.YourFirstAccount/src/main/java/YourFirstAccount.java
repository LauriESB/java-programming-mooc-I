
public class YourFirstAccount {
    
    // The exercise template comes with a ready-made class named Account. 
    // The Account object represents a bank account that has balance (i.e. one that has some amount of money in it).

    public static void main(String[] args) {
        Account objAcc = new Account("Lauri", 100.00);
        
        objAcc.deposit(20.0);
        
        System.out.println(objAcc);
        
    }
}
