package task.queue;

import java.util.Queue;

public class BuyerThread implements Runnable {
    private final Queue<CashBox> cashBoxes;

    public BuyerThread(Queue<CashBox> cashBoxes) {
        this.cashBoxes = cashBoxes;
    }

    @Override
    public void run() {
        try {
            while (true) {
                synchronized (cashBoxes) {
                    if (!cashBoxes.isEmpty()) {
                        CashBox cashBox = cashBoxes.remove();
                        System.out.println(Thread.currentThread().getName() + " обслуживается в кассе " + cashBox);

//                        Thread.sleep(5L);
                        cashBoxes.wait(5L);

                        System.out.println(Thread.currentThread().getName() + " освобождаю кассу " + cashBox);
                        cashBoxes.add(cashBox);
                        cashBoxes.notifyAll();
                        break;
                    } else {
                        System.out.println(Thread.currentThread().getName() + " ожидаю свободную кассу ");
//                        Thread.sleep(5L);
                        cashBoxes.wait();
                    }
                }
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}

