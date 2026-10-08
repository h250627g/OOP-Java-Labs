public class Manager extends Employee {

    private double bonus;

    // EXPLAIN: super(...) calls the Employee constructor first.
    public Manager(String name, double baseSalary, double bonus) {
        super(name, baseSalary);
        this.bonus = bonus;
    }

    @Override
    public double calculatePay() {
        return baseSalary + bonus;
    }

    public static void main(String[] args) {

        Manager manager = new Manager("Tanatswa", 800.0, 200.0);

        manager.describe();
    }
}
