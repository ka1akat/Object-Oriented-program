package lab1.t2;

public class BankAccount {
    public static final String BANK_NAME;
    public static final double MIN_INITIAL_BALANCE;

    private static int nextId = 1000;//один счетчик на весь класс

    private final int id; //Read-only
    private final String owner;
    private final AccountType type;

    private double balance;

    static {
        BANK_NAME = "KBTU Bank";
        MIN_INITIAL_BALANCE = 0.0;
    }

    {
        id = nextId++;
    }

    public BankAccount(String owner, AccountType type) {
        this(owner, type, MIN_INITIAL_BALANCE);
    }

    public BankAccount(String owner, AccountType type, double startBalance) {
        this.owner = owner; //объект, с которым сейчас работаем
        this.type = type;

        if (startBalance < MIN_INITIAL_BALANCE) {
            this.balance = MIN_INITIAL_BALANCE;
        } else {
            this.balance = startBalance;
        }
    }

    public int getId() {
        return id;
    }

    public String getOwner() {
        return owner;
    }

    public AccountType getType() {
        return type;
    }

    public double getBalance() {
        return balance;
    }

    //overloading 
    public void deposit(double amount) {
        deposit(amount, "No comment");
    }

    public void deposit(double amount, String comment) {
        if (amount <= 0) return;
        balance += amount;
        System.out.println("Deposit: " + amount + " | " + comment);
    }

    public boolean withdraw(double amount) {
        if (amount <= 0) return false;
        if (amount > balance) return false;
        balance -= amount;
        return true;
    }

    public static int getNextIdPreview() {
        return nextId;
    }

    @Override
    public String toString() {
        return "BankAccount{id=" + id +
                ", owner='" + owner + '\'' +
                ", type=" + type +
                ", balance=" + balance +
                ", bank='" + BANK_NAME + "'}";
    }
}
