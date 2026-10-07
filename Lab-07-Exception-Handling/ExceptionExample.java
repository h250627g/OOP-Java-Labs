public class ExceptionExample {

    public static void main(String[] args) {

        try {
            int number = Integer.parseInt("abc");
            System.out.println("Number: " + number);

        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid number format.");

        } finally {
            System.out.println("This block always executes.");
        }
    }
}
