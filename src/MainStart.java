public class MainStart {
    public static void main(String[] args) {

       // 100
        BankAccount myAcc = new BankAccount("UA123456789", 10000.0);

        System.out.println("Початковий стан");
        System.out.println("Баланс: " + myAcc.getBalance());

        System.out.println("від'ємний депозит");
        myAcc.deposit(-5000.0);

        System.out.println("зняття більше за баланс");
        myAcc.withdraw(15000.0);

        System.out.println("коректні операції");
        myAcc.deposit(20000.0);
        myAcc.withdraw(500.0);

        System.out.println("Кінцевий баланс: " + myAcc.getBalance());

    }
}