public class Main {
    public static void main(String[] args) {

        Animal[] animals = { new Dog(), new Cat(), new Dog() };

        for (Animal a : animals) {
            a.speak();
        }
    }
}