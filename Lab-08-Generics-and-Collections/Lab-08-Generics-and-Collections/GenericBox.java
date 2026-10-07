public class GenericBox<T> {

    private T value;

    public GenericBox(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public static void main(String[] args) {

        GenericBox<String> textBox = new GenericBox<>("Hello Java");
        GenericBox<Integer> numberBox = new GenericBox<>(100);

        System.out.println("Text: " + textBox.getValue());
        System.out.println("Number: " + numberBox.getValue());
    }
}
