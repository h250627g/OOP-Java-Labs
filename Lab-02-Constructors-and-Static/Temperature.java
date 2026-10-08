public class Temperature {

    private double celsius;

    // EXPLAIN: The constructor is private, so objects are created through factory methods.
    private Temperature(double celsius) {
        this.celsius = celsius;
    }

    // EXPLAIN: Creates a Temperature object from a Celsius value.
    public static Temperature fromCelsius(double celsius) {
        return new Temperature(celsius);
    }

    // EXPLAIN: Converts Fahrenheit to Celsius before creating the object.
    public static Temperature fromFahrenheit(double fahrenheit) {
        double celsius = (fahrenheit - 32) * 5 / 9;
        return new Temperature(celsius);
    }

    public double getCelsius() {
        return celsius;
    }

    public static void main(String[] args) {

        Temperature t1 = Temperature.fromCelsius(25);
        Temperature t2 = Temperature.fromFahrenheit(77);

        System.out.println("Temperature 1: " + t1.getCelsius() + " °C");
        System.out.println("Temperature 2: " + t2.getCelsius() + " °C");
    }
}
