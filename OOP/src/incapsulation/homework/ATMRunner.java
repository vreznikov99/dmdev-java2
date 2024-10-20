package incapsulation.homework;

public class ATMRunner {
    public static void main(String[] args) {
        ATM atm = new ATM(3,2,2);
        atm.info();
        atm.withdraw(45);
        System.out.println("----");
        atm.info();
        atm.addMoneyIntoATM(1, 2, 5);
        System.out.println("----");
        atm.info();
        System.out.println("----");
        atm.withdraw(300);
        atm.info();
    }
}
