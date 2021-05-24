package by.jonline.module4.task6;

public class Main {
    public static void main(String[] args) {
        Time time = new Time(12,14,15);
        time.showTime();
        time.addHours(44);
        time.showTime();
        time.addMinutes(120);
        time.showTime();
        time.addSeconds(3601);
        time.showTime();
    }
}
