/**
 * Process Synchronization
 * Wed, 21 Dec 2022
 */
public class Main {
    static int flag[] = new int[2];
    static int turn, val = 0;

    static class Work implements Runnable {
        int other;

        Work(int other) {
            this.other = other;
        }

        @Override
        public void run() {
            lock(other);

            for (int i = 0; i < 1000; i++)
                val++;

            unlock(other);
        }
    }

     protected static void lock_init() {
        flag[0] = flag[1] = 0;
        turn = 0;
    }

    static void lock(int other) {
        flag[other] = 1;
        turn = 1 - other;
        while (flag[1 - other] == 1 && turn == 1 - other);
    }

    static void unlock(int other) {
        flag[other] = 0;
    }

    public static void main(String[] args) throws InterruptedException {
        val = 0;

        lock_init();

        Thread t1 = new Thread(new Work(0));
        Thread t2 = new Thread(new Work(1));

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final Value: " + val);
    }
}