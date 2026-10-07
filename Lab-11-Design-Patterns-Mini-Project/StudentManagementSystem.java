import java.util.ArrayList;

public class StudentManagementSystem {

    static class Student {

        private String name;
        private int age;
        private String course;

        public Student(String name, int age, String course) {
            this.name = name;
            this.age = age;
            this.course = course;
        }

        public void displayDetails() {
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Course: " + course);
            System.out.println();
        }
    }

    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("Tanatswa", 20, "Software Engineering"));
        students.add(new Student("Nyasha", 21, "Computer Science"));
        students.add(new Student("Jeff", 20, "Information Technology"));

        System.out.println("Student Management System");
        System.out.println("-------------------------");

        for (Student student : students) {
            student.displayDetails();
        }
    }
}
