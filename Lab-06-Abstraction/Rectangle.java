public class Rectangle extends Shape {

    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(10, 5);

        rectangle.displayMessage();
        System.out.println("Rectangle Area: " + rectangle.calculateArea());
    }
}
