public class PaymentProcessor {
    public void process(PaymentMethod method, int amount) {
        System.out.println("Початок обробки платежу...");
        method.pay(amount);
        System.out.println("Платіж через " + method.name() + " успішний!");
    }
}