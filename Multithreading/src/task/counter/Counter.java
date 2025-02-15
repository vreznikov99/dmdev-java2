package task.counter;

public class Counter {
    private int count;
    private static String description;

    public static void init() {
        synchronized (Counter.class) {
            if (description == null) {
                description = "Test Description";
            }
        }
    }

    public int getCount() {
        synchronized (this) {
            return count;
        }
    }

    public synchronized void increment() {
        count++;
    }

    public void decrement() {
        count--;
    }

}
