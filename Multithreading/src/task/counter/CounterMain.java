package task.counter;

/**
 * Error with Race Condition
 */
public class CounterMain {
    public static void main(String[] args) {
        Counter counter = new Counter();

        Thread counterThread1 = new Thread(new CounterThread(counter));
        Thread counterThread2 = new Thread(new CounterThread(counter));
        Thread counterThread3 = new Thread(new CounterThread(counter));
        Thread counterThread4 = new Thread(new CounterThread(counter));

        counterThread1.start();
        counterThread2.start();
        counterThread3.start();
        counterThread4.start();

        try {
            counterThread1.join();
            counterThread2.join();
            counterThread3.join();
            counterThread4.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(counter.getCount());
    }
}
