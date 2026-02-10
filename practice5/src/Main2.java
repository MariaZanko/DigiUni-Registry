public class Main2 {
    public static void main(String[] args) {
        MultiNotifier notifier = new MultiNotifier();

        // Викликаємо один метод, а він запускає обидва default-методи
        notifier.send("Ваше замовлення готове!");
    }
}