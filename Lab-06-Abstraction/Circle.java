public class Circle extends Shape {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {

        Circle circle = new Circle(5);

        circle.displayMessage();
        System.out.println("Circle Area: " + circle.calculateArea());
    }
}
