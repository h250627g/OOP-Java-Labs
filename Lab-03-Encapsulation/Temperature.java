public class Temperature {

    // EXPLAIN: The temperature is stored internally in Kelvin.
    private double kelvin;

    public Temperature(double kelvin) {

        // EXPLAIN: Kelvin cannot be below absolute zero.
        if (kelvin < 0) {
            throw new IllegalArgumentException(
                "Temperature cannot be below absolute zero"
            );
        }

        this.kelvin = kelvin;
    }

    public double getCelsius() {
        return kelvin - 273.15;
    }

    public double getFahrenheit() {
        return (kelvin - 273.15) * 9 / 5 + 32;
    }

    public static void main(String[] args) {

        Temperature temperature = new Temperature(298.15);

        System.out.println("Celsius: " + temperature.getCelsius());
        System.out.println("Fahrenheit: " + temperature.getFahrenheit());

        try {
            Temperature invalid = new Temperature(-10);
        } catch (IllegalArgumentException e) {
            System.out.println("Rejected: " + e.getMessage());
        }
    }
}
