public class Student extends Person {

    String course;

    public Student(String name, int age, String course) {
        super(name, age);
        this.course = course;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Course: " + course);
    }
}
