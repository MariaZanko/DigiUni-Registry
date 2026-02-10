public class M {
    public static void main(String[] args) {
        PaymentProcessor processor = new PaymentProcessor();

        // Створюємо об'єкти
        PaymentMethod card = new CardPayment();
        PaymentMethod paypal = new PayPalPayment();

        // Тестуємо звичайну оплату

        // обробка платежів
        processor.process(card, 100);
        System.out.println("-");
        // знову просимо зробити оплату
        processor.process(paypal, 250);

        // Тестуємо оплату з комісією (default метод)
        System.out.println("Тест методу з комісією:");
        card.payWithFee(5000, 150);
    }
}