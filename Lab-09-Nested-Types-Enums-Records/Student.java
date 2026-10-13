
public record Student(String name, int age) {
    public static void main(String[] args) {
        Student student1 = new Student("Tanatswa", 20);
        Student student2 = new Student("Tanatswa", 20);

        System.out.println("Student: " + student1);
        System.out.println("Are the records equal? "
                + student1.equals(student2));
        System.out.println("Student name: " + student1.name());
    }
}
