public class BankAccount {

    private final String accountNumber; // final робить поле незмінним після конструктора
    private double balance;

    // Конструктор
    public BankAccount(String accountNumber, double initialBalance) {
        if (initialBalance < 0) {
            throw new IllegalArgumentException("Початковий баланс не може бути від'ємним!");
        }
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    // баланс
    public double getBalance() {
        return balance;
    }

    // поповнення
    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Помилка: Сума поповнення (" + amount + ") має бути більшою за 0");
        } else {
            balance += amount;
            System.out.println("Рахунок поповнено на: " + amount);
        }
    }

    //перевірка
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Помилка: Сума зняття має бути додатною");
        } else if (amount > balance) {
            System.out.println("Помилка: Недостатньо коштів на рахунку! Баланс: " + balance);
        } else {
            balance -= amount;
            System.out.println("Знято суму: " + amount);
        }
    }
}