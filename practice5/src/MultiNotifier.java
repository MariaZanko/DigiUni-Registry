public class MultiNotifier implements SmsNotifier, EmailNotifier {

    @Override
    public void send(String message) {
        System.out.println("--- MultiNotifier відправляє через усі канали ---");

        // Явний виклик default-методів через super
        SmsNotifier.super.send(message);
        EmailNotifier.super.send(message);
    }
}