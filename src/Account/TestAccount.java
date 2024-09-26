package Account;

public class TestAccount {
    public static void main(String[] args) {
        // Create two account instances with initial balances
        Account account1 = new Account("A001", "John Doe", 5000);
        Account account2 = new Account("A002", "Jane Doe", 4000);

        // Display the initial balances of both accounts
        System.out.println("Initial account balances:");
        System.out.println(account1);
        System.out.println(account2);

        // Transfer $1000 from the first account to the second
        account1.transferTo(account2, 1000);

        // Display the updated balances after the transfer
        System.out.println("\nBalances after transferring $1000 from Account 1 to Account 2:");
        System.out.println(account1);
        System.out.println(account2);
    }
}
