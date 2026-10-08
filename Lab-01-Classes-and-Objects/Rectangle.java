public class Rectangle {

    double width;
    double height;

    double area() {
        return width * height;
    }

    double perimeter() {
        return 2 * (width + height);
    }

    public static void main(String[] args) {

        Rectangle[] rectangles = new Rectangle[5];

        rectangles[0] = new Rectangle();
        rectangles[0].width = 4;
        rectangles[0].height = 5;

        rectangles[1] = new Rectangle();
        rectangles[1].width = 10;
        rectangles[1].height = 6;

        rectangles[2] = new Rectangle();
        rectangles[2].width = 7;
        rectangles[2].height = 3;

        rectangles[3] = new Rectangle();
        rectangles[3].width = 8;
        rectangles[3].height = 9;

        rectangles[4] = new Rectangle();
        rectangles[4].width = 5;
        rectangles[4].height = 4;

        Rectangle largest = rectangles[0];

        for (Rectangle rectangle : rectangles) {
            if (rectangle.area() > largest.area()) {
                largest = rectangle;
            }
        }

        System.out.println("Largest Rectangle:");
        System.out.println("Width: " + largest.width);
        System.out.println("Height: " + largest.height);
        System.out.println("Area: " + largest.area());
        System.out.println("Perimeter: " + largest.perimeter());
    }
}
