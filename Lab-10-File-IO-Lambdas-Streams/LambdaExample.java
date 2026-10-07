import java.util.ArrayList;

public class LambdaExample {

    public static void main(String[] args) {

        ArrayList<String> students = new ArrayList<>();

        students.add("Tanatswa");
        students.add("Nyasha");
        students.add("Jeff");

        System.out.println("Student Names:");

        students.forEach(name -> System.out.println(name));
    }
}
