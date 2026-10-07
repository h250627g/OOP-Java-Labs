public class Counter {

    static int count = 0;

    Counter() {
        count++;
    }

    public static void main(String[] args) {

        Counter counter1 = new Counter();
        Counter counter2 = new Counter();
        Counter counter3 = new Counter();

        System.out.println("Number of objects created: " + Counter.count);
    }
}
