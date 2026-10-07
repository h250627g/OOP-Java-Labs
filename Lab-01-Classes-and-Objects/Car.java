public class Car {

    String brand;
    String model;
    int year;

    void displayCarDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }

    public static void main(String[] args) {

        Car car1 = new Car();

        car1.brand = "Toyota";
        car1.model = "Corolla";
        car1.year = 2024;

        car1.displayCarDetails();
    }
}
