
public class YourFirstBankTransfer {
    
    // The Account from the previous exercise class is also available in this exercise.
    // Write a program that:
    // Creates an account named "Matthews account" with the balance 1000
    // Creates an account named "My account" with the balance 0
    // Withdraws 100.0 from Matthew's account
    // Deposits 100.0 to "my account"
    // Prints both the accounts

    public static void main(String[] args) {
        Account objAcc = new Account("Matthews account", 1000);
        Account objNewAcc = new Account("My account", 0);
        
        objAcc.withdrawal(100.00);
        objNewAcc.deposit(100.00);
        
        System.out.println(objAcc);
        System.out.println(objNewAcc);
    }
}
