package polymorphysm;

import inheritance.Computer;

public class Mobile extends Computer {

    public Mobile(int ssd, int ram) {
        super(ssd, ram);
    }

    @Override
    public void load() {
        System.out.println("I have lunched");
    }
}
