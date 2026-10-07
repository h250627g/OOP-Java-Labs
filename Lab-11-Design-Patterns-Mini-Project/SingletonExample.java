public class SingletonExample {

    private static SingletonExample instance;

    private SingletonExample() {
    }

    public static SingletonExample getInstance() {

        if (instance == null) {
            instance = new SingletonExample();
        }

        return instance;
    }

    public void displayMessage() {
        System.out.println("Singleton object is working.");
    }

    public static void main(String[] args) {

        SingletonExample object = SingletonExample.getInstance();

        object.displayMessage();
    }
}
