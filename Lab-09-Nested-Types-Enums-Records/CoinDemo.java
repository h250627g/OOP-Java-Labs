
enum Coin {
    PENNY(1),
    NICKEL(5),
    DIME(10),
    QUARTER(25);

    private final int value;

    Coin(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public static int fewestCoins(int amount) {
        if (amount < 0) {
            throw new IllegalArgumentException(
                "Amount cannot be negative."
            );
        }

        int count = 0;

        for (Coin coin : new Coin[]{
                QUARTER, DIME, NICKEL, PENNY}) {
            count += amount / coin.value;
            amount %= coin.value;
        }

        return count;
    }
}

public class CoinDemo {
    public static void main(String[] args) {
        int amount = 41;

        System.out.println("Amount: " + amount + " cents");
        System.out.println(
            "Fewest coins needed: " + Coin.fewestCoins(amount)
        );
    }
}
