package lab2.t3;

public class CheckingAccount extends Account {
    private int transactionCount;
    private static final int FREE_TRANSACTIONS = 3;
    private static final double TRANSACTION_FEE = 0.02;

    public CheckingAccount(int accNumber) {
        super(accNumber);
        transactionCount = 0;
    }

    @Override
    public void deposit(double sum) {
        super.deposit(sum);
        if (sum > 0) {
            transactionCount++;
        }
    }

    @Override
    public void withdraw(double sum) {
        double before = getBalance();
        super.withdraw(sum);
        if (sum > 0 && sum <= before) {
            transactionCount++;
        }
    }

    public void deductFee() {
        if (transactionCount > FREE_TRANSACTIONS) {
            int extraTransactions = transactionCount - FREE_TRANSACTIONS;
            double fee = extraTransactions * TRANSACTION_FEE;
            super.withdraw(fee);
        }
        transactionCount = 0;
    }

    @Override
    public String toString() {
        return "CheckingAccount " + super.toString() + ", transaction count: " + transactionCount;
    }
}
