public class Employee {

    private static int nextId = 1;

    int employeeId;
    String name;
    double salary;

    // EXPLAIN: Each employee gets a unique ID from the shared static counter.
    public Employee(String name, double salary) {
        this.employeeId = nextId++;
        this.name = name;
        this.salary = salary;
    }

    // EXPLAIN: Overloaded constructor with only the employee name.
    public Employee(String name) {
        this(name, 0.0);
    }

    // EXPLAIN: Overloaded constructor with no arguments.
    public Employee() {
        this("Unknown", 0.0);
    }

    // EXPLAIN: Copy constructor creates a new employee using another employee's data.
    public Employee(Employee other) {
        this(other.name, other.salary);
    }

    public void display() {
        System.out.println(
            "ID: " + employeeId +
            ", Name: " + name +
            ", Salary: " + salary
        );
    }

    public static void main(String[] args) {

        Employee e1 = new Employee("Tanatswa", 800.0);
        Employee e2 = new Employee("Jeff");
        Employee e3 = new Employee();
        Employee e4 = new Employee(e1);

        e1.display();
        e2.display();
        e3.display();
        e4.display();
    }
}
