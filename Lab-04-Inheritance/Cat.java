public class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    public void meow() {
        System.out.println(name + " is meowing.");
    }

    public static void main(String[] args) {

        Cat cat = new Cat("Milo");

        cat.displayName();
        cat.eat();
        cat.meow();

    }
}
