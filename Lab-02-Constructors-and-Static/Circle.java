public class Circle {

    double radius;

    // EXPLAIN: This constructor sets the radius given by the user.
    public Circle(double radius) {
        this.radius = radius;
    }

    // EXPLAIN: This no-argument constructor uses 1.0 as the default radius.
    public Circle() {
        this.radius = 1.0;
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {

        Circle c1 = new Circle(5.0);
        Circle c2 = new Circle();

        System.out.println("Circle 1 radius: " + c1.radius);
        System.out.println("Circle 1 area: " + c1.area());

        System.out.println("Circle 2 radius: " + c2.radius);
        System.out.println("Circle 2 area: " + c2.area());
    }
}
