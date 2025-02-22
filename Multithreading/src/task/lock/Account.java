package task.lock;

public class Account {
    private static int generator = 1;
    private int id;
    private int money;

    public Account(int money) {
        this.id = generator++;
        this.money = money;
    }

    public void addMoney(int moneyToAdd){
        this.money += moneyToAdd;
    }

    public boolean withdrawMoney(int moneyToWithdraw){
        if(this.money >= moneyToWithdraw){
            this.money -= moneyToWithdraw;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", money=" + money +
                '}';
    }
}
