public record StudentRecord(String name, int age, String department) {

    public static void main(String[] args) {

        StudentRecord student =
                new StudentRecord("Tanatswa", 20, "Software Engineering");

        System.out.println("Name: " + student.name());
        System.out.println("Age: " + student.age());
        System.out.println("Department: " + student.department());
    }
}
