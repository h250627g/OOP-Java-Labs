
import java.util.Arrays;
import java.util.List;

record Student(String name, double marks) {}

public class StudentStreamDemo {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
            new Student("Tanatswa", 85),
            new Student("Amanda", 90),
            new Student("Brian", 65),
            new Student("Tendai", 75),
            new Student("Chipo", 55)
        );

        double average = students.stream()
            .mapToDouble(Student::marks)
            .average()
            .orElse(0);

        System.out.println("Class average: " + average);
        System.out.println("Students above class average:");

        students.stream()
            .filter(student -> student.marks() > average)
            .map(Student::name)
            .sorted()
            .forEach(System.out::println);
    }
}
