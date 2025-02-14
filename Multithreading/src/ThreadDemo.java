public class ThreadDemo {
    public static void main(String[] args) {
        SimpleThread simpleThread = new SimpleThread();
        Thread threadRunnable = new Thread(new SimpleRunnable());
        Thread threadLambda = new Thread(() -> System.out.println("Lambda Thread: " + Thread.currentThread().getName()));

        simpleThread.start();
        threadRunnable.start();
        threadLambda.start();

        try {
            simpleThread.join();
            threadRunnable.join();
            threadLambda.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Main Thread: " + Thread.currentThread().getName());
    }
}
