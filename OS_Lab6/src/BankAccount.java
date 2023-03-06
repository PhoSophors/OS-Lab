
/**
 * balance: 2000
 * father : + 1000
 * son    : - 5000
 * how much value of father and son ?
 */
public class BankAccount {
    static int[] flag = new int[2];
    static int turn;
    private static int balance = 0;
    private static int other;


    static class Transaction implements Runnable {
        int other;
        int amount;

        Transaction(int other, int amount) {
            this.other = other;
            this.amount = amount;
        }

        @Override
        public void run() {
            lock(1000);

            balance += amount;

            unlock(other);
        }
    }

    static void lock_init() {
        flag[0] = flag[1] = 0;
        turn = 0;
    }

    static void lock(int i) {
        flag[other] = 1;
        turn = 1 - other;
        while (flag[1 - other] == 1 && turn == 1 - other);
    }

    static void unlock(int other) {
        flag[other] = 0;
    }

    public static void main(String[] args) throws InterruptedException {
        balance = 0;

        lock_init();

        Thread father = new Thread(new Transaction(0, 1000));
        Thread son = new Thread(new Transaction(1, -500));

        father.start();
        father.join();

        son.start();
        son.join();


        System.out.println("Final Balance: " + balance);

    }


}