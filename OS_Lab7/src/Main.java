/**
 * Process Synchronization
 * Wed, 21 Dec 2022
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {

        Father father = new Father();
        Son son = new Son();

        /** start() method causes this thread to begin execution,
         * the Java Virtual Machine calls the run method of this thread.*/

        /**  join() method which allows one thread to wait until another thread completes its execution */

        father.start();
        father.join();
        System.out.print("\nFather = ");
        System.out.print(BankAccount.getDeposit());

        son.start();
        son.join();
        System.out.print("\nSon = ");
        System.out.println(BankAccount.getWithdraw());
    }
}