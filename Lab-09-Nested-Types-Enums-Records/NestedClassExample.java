public class NestedClassExample {

    private String name = "Tanatswa";

    class Student {

        void displayName() {
            System.out.println("Student Name: " + name);
        }
    }

    public static void main(String[] args) {

        NestedClassExample example = new NestedClassExample();

        NestedClassExample.Student student = example.new Student();

        student.displayName();
    }
}
