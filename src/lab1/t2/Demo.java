package lab1.t2;

public class Demo {
    public static void main(String[] args) {
        BankAccount a1 = new BankAccount("Karakat", BankAccount.AccountType.SAVINGS);
        BankAccount a2 = new BankAccount("Aruzhan", BankAccount.AccountType.CHECKING, 200);

        a1.deposit(50); //overload1
        a2.deposit(100, "Salary"); //overload2

        a2.withdraw(40);

        System.out.println(a1);
        System.out.println(a2);

        System.out.println("Next id will be: " + BankAccount.getNextIdPreview());
    }
}

