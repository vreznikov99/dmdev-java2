package incapsulation.homework;

public class ATM {

    private static final int LOWEST = 20;
    private static final int MIDDLE = 50;
    private static final int HIGHEST = 100;
    private int amount20;
    private int amount50;
    private int amount100;

    public ATM(int amount20, int amount50, int amount100) {
        this.amount20 = amount20;
        this.amount50 = amount50;
        this.amount100 = amount100;
    }

    public int getAmount20() {
        return amount20;
    }

    public void setAmount20(int amount20) {
        this.amount20 = amount20;
    }

    public int getAmount50() {
        return amount50;
    }

    public void setAmount50(int amount50) {
        this.amount50 = amount50;
    }

    public int getAmount100() {
        return amount100;
    }

    public void setAmount100(int amount100) {
        this.amount100 = amount100;
    }

    public void info() {
        System.out.println("Banknote(s) 20: " + this.amount20);
        System.out.println("Banknote(s) 50: " + this.amount50);
        System.out.println("Banknote(s) 100: " + this.amount100);
        System.out.println("Overall sum: " + overallSum());
    }

    public int overallSum() {
        return amount20 * LOWEST + amount50 * MIDDLE + amount100 * HIGHEST;
    }

    public boolean withdraw(int moneyToWithdraw) {
        int amount20ToWithdraw = 0;
        int amount50ToWithdraw = 0;
        int amount100ToWithdraw = 0;
        int sumRemains = moneyToWithdraw;
        if (this.overallSum() >= moneyToWithdraw) {
            while (sumRemains > 0) {
                if (amount100 > 0 && sumRemains % HIGHEST == 0) {
                    amount100ToWithdraw = sumRemains / HIGHEST;
                    if(amount100ToWithdraw > amount100){
                        sumRemains -= amount100 * HIGHEST;
                        amount100ToWithdraw = amount100;
                    } else{
                        sumRemains -= amount100ToWithdraw * HIGHEST;
                    }
                    amount100 -= amount100ToWithdraw;
                } else if (amount50 > 0 && sumRemains % MIDDLE == 0) {
                    amount50ToWithdraw = sumRemains / MIDDLE;
                    if(amount50ToWithdraw > amount50){
                        sumRemains -= amount50 * MIDDLE;
                        amount50ToWithdraw = amount50;
                    } else{
                        sumRemains -= amount100ToWithdraw * MIDDLE;
                    }
                    amount50 -= amount50ToWithdraw;
                } else if (amount20 > 0 && sumRemains % LOWEST == 0) {
                    amount20ToWithdraw = sumRemains / LOWEST;
                    if(amount20ToWithdraw > amount50){
                        sumRemains -= amount20 * LOWEST;
                        amount20ToWithdraw = amount20;
                    } else{
                        sumRemains -= amount20ToWithdraw * LOWEST;
                    }
                    amount20 -= amount20ToWithdraw;
                } else {
                    System.out.println("There is no banknotes to withdraw this sum");
                    break;
                }
            }
            return true;
        } else {
            return false;
        }
    }

    public void addMoneyIntoATM(int amount20, int amount50, int amount100) {
        this.amount20 += amount20;
        this.amount50 += amount50;
        this.amount100 += amount100;
    }
}
