public class BankAccountDemo {

    public static void main(String[] args) {

        BankAccount account = new BankAccount(100);

        try {
            account.withdraw(150);
        } catch (InsufficientFundsException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Balance: " + account.getBalance());
    }
}
