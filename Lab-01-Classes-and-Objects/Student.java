public class Student {

    String name;
    int age;

    void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
    }

    public static void main(String[] args) {

       // EXPLAIN: The new keyword creates an object from the Student class.
        Student student1 = new Student();

        student1.name = "Tanatswa";
        student1.age = 20;

        student1.displayDetails();
    }
}
