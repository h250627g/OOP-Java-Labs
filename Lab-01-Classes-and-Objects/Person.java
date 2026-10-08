public class Person {

    String name;
    Address address;

    public Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public static void main(String[] args) {

        Address address = new Address("Harare");

        Person person1 = new Person("Tanatswa", address);

        // EXPLAIN: The chained dot expression accesses the city through Person -> Address.
        System.out.println("Person: " + person1.name);
        System.out.println("City: " + person1.address.city);

        Person person2 = new Person("Jeff", null);

        // EXPLAIN: A null address does not refer to an Address object.
        try {
            System.out.println("City: " + person2.address.city);
        } catch (NullPointerException e) {
            System.out.println("Error: Person has no address.");
        }
    }
}
