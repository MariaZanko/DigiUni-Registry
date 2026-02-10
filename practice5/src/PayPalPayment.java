public class PayPalPayment implements PaymentMethod {
    @Override
    public String name() {
        return "PayPal";
    }

    @Override
    public void pay(int amount) {
        System.out.println("Оплата через PayPal на суму: " + amount);
    }
}