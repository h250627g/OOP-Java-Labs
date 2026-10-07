public class ArrayExample {

    public static void main(String[] args) {

        int[] numbers = {10, 20, 30};

        try {
            System.out.println("Number: " + numbers[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index is out of bounds.");
        }
    }
}
