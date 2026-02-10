public interface PaymentMethod {
    String name();
    void pay(int amount);

    // для оплати з комісією
    default void payWithFee(int amount, int fee) {
        int total = amount + fee;
        System.out.println("Оплата через " + name() + " з комісією. Сума: " + amount + " + комісія: " + fee + " = " + total);
        pay(total);
    }
}