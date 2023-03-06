/**
 * This class represents son process that takes money out of the bank account.
 */
public class Son extends Thread{
    /** The run() method is available in the thread class constructed using a separate Runnable object */
    public void run() {
        BankAccount.withdraw();
    }
}
