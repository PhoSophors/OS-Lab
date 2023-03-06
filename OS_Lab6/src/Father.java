/**
 * Father class representing father process that puts money into the bank account.
 * This class should extend Thread.
 */
public class Father extends Thread {
    /** The run() method is available in the thread class constructed using a separate Runnable object */
    public void run() {
        BankAccount.lock(1000);
    }
}
