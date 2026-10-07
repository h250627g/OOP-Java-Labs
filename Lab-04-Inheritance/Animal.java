public class Animal {

    String name;

    public Animal(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println(name + " is eating.");
    }

    public void displayName() {
        System.out.println("Animal Name: " + name);
    }

    public static void main(String[] args) {

        Animal animal = new Animal("Lion");

        animal.displayName();
        animal.eat();
    }
}
