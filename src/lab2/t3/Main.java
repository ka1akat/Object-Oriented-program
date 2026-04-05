package lab2.t3;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();

        Account a1 = new Account(1001);
        SavingsAccount s1 = new SavingsAccount(1002, 5.0);
        CheckingAccount c1 = new CheckingAccount(1003);

        a1.deposit(500);
        s1.deposit(1000);

        c1.deposit(200);
        c1.withdraw(50);
        c1.deposit(100);
        c1.withdraw(20);
        c1.deposit(30);

        bank.openAccount(a1);
        bank.openAccount(s1);
        bank.openAccount(c1);

        System.out.println("Before update:");
        bank.printAccounts();

        bank.update();

        System.out.println("\nAfter update:");
        bank.printAccounts();

        a1.transfer(100, s1);

        System.out.println("\nAfter transfer from Account to SavingsAccount:");
        bank.printAccounts();

        bank.closeAccount(1001);

        System.out.println("\nAfter closing account 1001:");
        bank.printAccounts();
    }
}
