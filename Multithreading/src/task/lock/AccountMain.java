package task.lock;

public class AccountMain {
    public static void main(String[] args) throws InterruptedException {
        Account account1 = new Account(20000);
        Account account2 = new Account(20000);

        Thread accThread1 = new Thread(new AccountRunnable(account1, account2));
        Thread accThread2 = new Thread(new AccountRunnable(account2, account1));

        accThread1.start();
        accThread2.start();

        accThread1.join();
        accThread2.join();

        System.out.println(account1);
        System.out.println(account2);
    }
}
