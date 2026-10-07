public class Cat extends Animal {

    @Override
    public void sound() {
        System.out.println("Cat meows.");
    }

    public static void main(String[] args) {

        Animal animal = new Cat();

        animal.sound();
    }
}
