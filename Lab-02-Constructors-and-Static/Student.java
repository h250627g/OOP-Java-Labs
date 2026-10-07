public class Student {

    String name;
    int age;

    // Constructor
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {

        Student student1 = new Student("Tanatswa", 20);

        student1.displayDetails();
    }
}
