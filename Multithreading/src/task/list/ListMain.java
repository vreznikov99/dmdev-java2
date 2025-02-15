package task.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListMain {
    public static void main(String[] args) throws InterruptedException {
        List<Integer> list = Collections.synchronizedList(new ArrayList<>());

        Thread thread1 = new Thread(new ListRunnable(list));
        Thread thread2 = new Thread(new ListRunnable(list));
        Thread thread3 = new Thread(new ListRunnable(list));
        Thread thread4 = new Thread(new ListRunnable(list));
        Thread thread5 = new Thread(new ListRunnable(list));
        Thread thread6 = new Thread(new ListRunnable(list));
        Thread thread7 = new Thread(new ListRunnable(list));

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
        thread6.start();
        thread7.start();

        thread1.join();
        thread2.join();
        thread3.join();
        thread4.join();
        thread5.join();
        thread6.join();
        thread7.join();

        System.out.println(list);

    }
}
