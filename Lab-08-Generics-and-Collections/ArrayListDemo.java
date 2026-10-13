import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(12);
        numbers.add(5);
        numbers.add(20);
        numbers.add(8);
        numbers.add(15);
        numbers.add(3);
        numbers.add(10);
        numbers.add(25);
        numbers.add(7);
        numbers.add(18);

        int sum = 0;
        int maximum = numbers.get(0);

        for (int number : numbers) {
            sum += number;

            if (number > maximum) {
                maximum = number;
            }
        }

        System.out.println("Numbers: " + numbers);
        System.out.println("Sum: " + sum);
        System.out.println("Maximum: " + maximum);

        Collections.reverse(numbers);

        System.out.println("Reverse order: " + numbers);
    }
}
