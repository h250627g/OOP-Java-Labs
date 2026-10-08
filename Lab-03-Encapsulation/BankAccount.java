import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BankAccount {

    private String accountNumber;
    private String ownerName;
    private double balance;

    private final List<String> transactions = new ArrayList<>();

    public BankAccount(String accountNumber, String ownerName, double openingBalance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = openingBalance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit must be positive");
        }

        balance += amount;
        transactions.add("Deposited: " + amount);
    }

    public boolean withdraw(double amount) {
        if (amount <= 0 || amount > balance) {
            return false;
        }

        balance -= amount;
        transactions.add("Withdrawn: " + amount);
        return true;
    }

    // EXPLAIN: An unmodifiable copy prevents outside code from changing the internal list.
    public List<String> getTransactions() {
        return Collections.unmodifiableList(new ArrayList<>(transactions));
    }

    public void display() {
        System.out.println(
            accountNumber + " [" + ownerName + "] balance: " + balance
        );
    }

    public static void main(String[] args) {

        BankAccount account = new BankAccount("ACC-001", "Tanatswa", 500.0);

        account.deposit(250.0);
        account.withdraw(100.0);

        account.display();

        System.out.println("Transactions:");

        for (String transaction : account.getTransactions()) {
            System.out.println(transaction);
        }

        try {
            account.getTransactions().clear();
        } catch (UnsupportedOperationException e) {
            System.out.println("Transaction history cannot be modified directly.");
        }
    }
}
