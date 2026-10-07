import java.util.HashMap;

public class HashMapExample {

    public static void main(String[] args) {

        HashMap<Integer, String> students = new HashMap<>();

        students.put(1, "Tanatswa");
        students.put(2, "Nyasha");
        students.put(3, "Jeff");

        System.out.println("Student List:");

        for (Integer id : students.keySet()) {
            System.out.println("ID: " + id + ", Name: " + students.get(id));
        }
    }
}
