public class FinalDemo {

    static class Vehicle {

        protected String brand;

        public Vehicle(String brand) {
            this.brand = brand;
        }

        public final void start() {
            System.out.println(brand + " is starting.");
        }
    }

    static class Car extends Vehicle {

        public Car(String brand) {
            super(brand);
        }

        public void display() {
            System.out.println("Car brand: " + brand);
        }
    }

    public static void main(String[] args) {

        Car car = new Car("Toyota");

        car.display();
        car.start();
    }
}
