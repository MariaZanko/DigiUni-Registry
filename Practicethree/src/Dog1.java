class Dog1 extends Animal1 {
    @Override
    public void speak() { System.out.println("Woof!"); }

    // Специфічний метод підкласу
    public void fetchStick() { System.out.println("Dog fetched a stick!"); }
}