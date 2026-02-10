public class CardPayment implements PaymentMethod {
    @Override
    public String name() {
        return "Банківська карта";
    }

    @Override
    public void pay(int amount) {
        System.out.println("Списано " + amount + " грн з карти.");
    }
}
