package com.dmdev.task1;

/**
 * 1. Создать класс, описывающий промежуток времени.
 *    Сам промежуток времени должен задаваться тремя свойствами:
 *    секундами, минутами и часами.
 *    Создать метод для получения полного количества секунд в объекте
 *    Создать два конструктора: первый принимает общее количество
 *    секунд, второй - часы, минуты и секунды по отдельности.
 *    Создать метод для вывода данных.
 */

public class TimeIntervalRunner {
    public static void main(String[] args) {
        TimeInterval timeInterval = getTimeInterval();

        TimeInterval timeInterval2 = new TimeInterval(3750);
        System.out.println(timeInterval2.totalSeconds());
        timeInterval2.print();

        TimeInterval timeInterval3 = timeInterval.sum(timeInterval2);
        timeInterval3.print();
    }

    private static TimeInterval getTimeInterval() {
        TimeInterval timeInterval = new TimeInterval(1, 2, 30);
        System.out.println(timeInterval.totalSeconds());
        return timeInterval;
    }

}
