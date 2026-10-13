import java.util.Scanner;
import java.util.InputMismatchException;

public class DivisionDemo {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Enter the first integer: ");
            int first = input.nextInt();

            System.out.print("Enter the second integer: ");
            int second = input.nextInt();

            int result = first / second;

            System.out.println("Result: " + result);

        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter integers only.");

        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");

        } finally {
            input.close();
        }
    }
}
