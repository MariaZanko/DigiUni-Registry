class MemoryTask {

    public void run() {

        int number = 10;


        String message = new String("Привіт, JVM!");


        int[] numbers = {1, 2, 3, 4, 5};

        int[] aliasNumbers = numbers;


        String[] colors = {"Червоний", "Зелений"};

        String[] sameColors = colors;


        aliasNumbers[0] = 99;
        sameColors[0] = "Синій";

        System.out.println("--- Результати роботи з пам'яттю ---");
        System.out.println("Примітив: " + number);
        System.out.println("Об'єкт String: " + message);

        System.out.println("Доказ для масиву примітивів (int[]):");
        System.out.println("numbers[0]: " + numbers[0] + " (змінено через aliasNumbers)");
        System.out.println("Посилаються на один об'єкт: " + (numbers == aliasNumbers));

        System.out.println("Доказ для масиву об'єктів (String[]):");
        System.out.println("colors[0]: " + colors[0] + " (змінено через sameColors)");
        System.out.println("Посилаються на один об'єкт: " + (colors == sameColors));

        System.out.println("Висновки");
        System.out.println(" Змінні aliasNumbers та sameColors не копіюють дані, а лише дублюють адресу.");
        System.out.println("Оператор '==' порівнює адреси в Stack, а не вміст у Heap.");
    }

    public static void main(String[] args) {
        new MemoryTask().run();
    }
}