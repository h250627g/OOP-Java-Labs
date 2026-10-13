public class AnimalDemo {

    public static void main(String[] args) {

        Animal[] animals = {
            new Cat(),
            new Cow(),
            new Duck()
        };

        for (Animal animal : animals) {
            animal.sound();
        }
    }
}
