package task.vol;

import com.sun.jdi.ThreadGroupReference;

public class VolatileMain {

    private static volatile boolean flag = false;

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(() -> {
            while (!flag) {
                System.out.println("Flag still false");
            } ;
        });
        Thread thread2 = new Thread(() -> {
            flag = true;
            System.out.println("Flag changed on true");
        });

        thread1.start();
        Thread.sleep(10);
        thread2.start();

    }
}
