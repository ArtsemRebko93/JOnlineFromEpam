package by.jonline.module5.task3;

/*
Создать класс Календарь с внутренним классом,
с помощью объектов которого можно хранить информацию о выходных и праздничных днях.
 */

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Calendar calendar = new Calendar(2021);
        calendar.addHoliday(LocalDate.of(2021,1,1),"New Year");
        calendar.showMyHolidays();
    }
}
