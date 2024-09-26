package Account;

public class Account {
    // Attributes to store the account holder's ID, name, and balance
    private String id;
    private String name;
    private int balance = 0;

    // Constructor to initialize the account with an ID and name
    public Account(String id, String name) {
        this.id = id;
        this.name = name;
    }

    // Constructor to initialize the account with an ID, name, and a starting balance
    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    // Returns the account ID
    public String getID() {
        return id;
    }

    // Returns the account holder's name
    public String getName() {
        return name;
    }

    // Returns the current balance of the account
    public int getBalance() {
        return balance;
    }

    // Adds the specified amount to the account balance
    public int credit(int amount) {
        this.balance += amount;
        return this.balance;
    }

    // Deducts the specified amount from the account balance if there are sufficient funds
    public int debit(int amount) {
        if (amount <= this.balance) {
            this.balance -= amount;
        } else {
            System.out.println("Insufficient funds for this transaction");
        }
        return this.balance;
    }

    // Transfers the specified amount to another account, ensuring sufficient balance
    public int transferTo(Account another, int amount) {
        if (amount <= this.balance) {
            this.balance -= amount;
            another.credit(amount);
        } else {
            System.out.println("Insufficient balance to complete the transfer");
        }
        return this.balance;
    }

    // Returns a string representation of the account's details
    @Override
    public String toString() {
        return "Account[id=" + id + ", name=" + name + ", balance=" + balance + "]";
    }
}
