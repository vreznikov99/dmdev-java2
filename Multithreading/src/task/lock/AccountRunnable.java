package task.lock;

public class AccountRunnable implements Runnable{
    private final Account accountTo;
    private final Account accountFrom;

    public AccountRunnable(Account accountTo, Account accountFrom) {
        this.accountTo = accountTo;
        this.accountFrom = accountFrom;
    }

    @Override
    public void run() {
        for (int i = 0; i < 2000; i++) {
            synchronized (accountFrom){
                synchronized (accountTo){
                    if(accountFrom.withdrawMoney(10)){
                        accountTo.addMoney(10);
                    }
                }
            }
        }
    }
}
