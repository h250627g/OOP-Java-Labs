interface InterfaceA {

    default void hello() {
        System.out.println("Hello from Interface A");
    }
}

interface InterfaceB {

    default void hello() {
        System.out.println("Hello from Interface B");
    }
}

public class DefaultMethodDemo implements InterfaceA, InterfaceB {

    @Override
    public void hello() {
        InterfaceA.super.hello();
        InterfaceB.super.hello();
        System.out.println("Conflict resolved in DefaultMethodDemo");
    }

    public static void main(String[] args) {

        DefaultMethodDemo demo = new DefaultMethodDemo();
        demo.hello();
    }
}
