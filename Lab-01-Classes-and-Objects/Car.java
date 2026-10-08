public class Car {

    String brand;
    int year;
    double mileage;

    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Year: " + year);
        System.out.println("Mileage: " + mileage + " km");
    }

    public static void main(String[] args) {

        // EXPLAIN: new creates three separate Car objects.
        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();

        car1.brand = "Toyota";
        car1.year = 2020;
        car1.mileage = 45000;

        car2.brand = "Honda";
        car2.year = 2018;
        car2.mileage = 60000;

        car3.brand = "BMW";
        car3.year = 2022;
        car3.mileage = 25000;

        car1.display();
        car2.display();
        car3.display();
    }
}
