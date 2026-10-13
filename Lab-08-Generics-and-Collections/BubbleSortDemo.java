
import java.util.Arrays;

public class BubbleSortDemo {

    public static <T extends Comparable<T>> void bubbleSort(T[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    T temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Integer[] numbers = {5, 2, 9, 1, 3};
        String[] names = {"Zara", "Amanda", "Brian", "Tendai"};

        bubbleSort(numbers);
        bubbleSort(names);

        System.out.println("Sorted integers: " + Arrays.toString(numbers));
        System.out.println("Sorted names: " + Arrays.toString(names));
    }
}
