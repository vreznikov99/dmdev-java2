package task.list;

import java.util.LinkedList;
import java.util.List;

public class ListRunnable implements Runnable {
    private final List<Integer> list;

    public ListRunnable(List<Integer> list) {
        this.list = list;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
//                synchronized (list) {
            list.add(i);
//            }
        }
    }
}
