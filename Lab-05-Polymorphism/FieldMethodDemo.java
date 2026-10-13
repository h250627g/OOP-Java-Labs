class Parent {
    String message = "Parent field";

    void display() {
        System.out.println("Parent method");
    }
}

class Child extends Parent {
    String message = "Child field";

    @Override
    void display() {
        System.out.println("Child method");
    }
}

public class FieldMethodDemo {
    public static void main(String[] args) {

        Parent obj = new Child();

        System.out.println(obj.message);
        obj.display();
    }
}
