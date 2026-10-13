import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StudentSortDemo {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        students.add(new Student("Tendai", 75));
        students.add(new Student("Amanda", 90));
        students.add(new Student("Brian", 82));

        // Sort by name using Comparable
        students.sort(null);

        System.out.println("Students sorted by name:");
        for (Student student : students) {
            System.out.println(student);
        }

        // Sort by marks using Comparator
        students.sort(Comparator.comparingDouble(Student::getMarks));

        System.out.println("\nStudents sorted by marks:");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
