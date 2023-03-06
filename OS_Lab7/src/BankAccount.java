
/**
 * balance: 2000
 * father : + 1000
 * son    : - 5000
 * <p>
 * how much value of father and son ?
 */
//In this class, it consists of a non-default constructor
public final class BankAccount {
    private static final int balance = 2000, father = 1000, son = 500;
    private static int deposit, withdraw;

    /** deposit method that is used to deposit money to bank account */
    public static void deposit() {
        deposit = balance + father;
    }
    /** withdraw methods is for withdrawing money from the bank account */
    public static void withdraw() {
        withdraw = balance - son;
    }

    // getter
    public static int getDeposit() {
        return deposit;
    }
    public static int getWithdraw() {
        return withdraw;
    }
}
