package by.jonline.module5.task3;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class Calendar {

    private List <Holiday> listWeekendDay;
    private List <Holiday> listHolidays;

    {
        listWeekendDay = new ArrayList<>();
        listHolidays = new ArrayList<>();
    }

    public Calendar () {

    }

    public Calendar (int year) {
        setYear(year);
    }

    public void addHoliday(LocalDate holidayDate, String nameOfHoliday)
    {
        listHolidays.add(new Holiday(holidayDate, nameOfHoliday));
        listHolidays.sort(Comparator.comparing(Holiday::getDate).thenComparing(Holiday::getNameHoliday));
    }

    public Calendar (int year, Holiday holiday) {
        setYear(year);
        listHolidays.add(holiday);
    }

    private void setYear (int year) {
        LocalDate date = LocalDate.of(year,1,1);
        while (!date.equals(LocalDate.of(year,12,31))) {
            if (date.getDayOfWeek() == DayOfWeek.SATURDAY || date.getDayOfWeek() == DayOfWeek.SUNDAY) {
                listWeekendDay.add(new Holiday(date,"Weekend by DayOfWeek"));
            }
            date = date.plusDays(1);
        }
    }

    public void showMyHolidays () {
        for (Holiday date: listHolidays) {
            if (date.MY_HOLIDAY) {
                System.out.println(date.toString());
            }
        }
    }

    public void showMyDayOff () {
        for (Holiday date: listWeekendDay) {
            System.out.println(date.toString());
        }
    }

    static class Holiday {

        private LocalDate date;
        private String nameHoliday;
        private final boolean MY_HOLIDAY = true;

        public Holiday () {

        }

        public Holiday (LocalDate date,String nameHoliday) {
            this.date = date;
            this.nameHoliday = nameHoliday;
        }

        public LocalDate getDate() {
            return date;
        }

        public String getNameHoliday() {
            return nameHoliday;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Holiday holiday = (Holiday) o;
            return Objects.equals(date, holiday.date);
        }

        @Override
        public int hashCode() {
            return Objects.hash(date);
        }

        @Override
        public String toString() {
            return "Holiday{" +
                    "date=" + date.format(DateTimeFormatter.ofPattern("dd.MM.yyyy")) + ", " + nameHoliday +
                    '}';
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Calendar calendar = (Calendar) o;
        return Objects.equals(listWeekendDay, calendar.listWeekendDay) &&
                Objects.equals(listHolidays, calendar.listHolidays);
    }

    @Override
    public int hashCode() {
        return Objects.hash(listWeekendDay, listHolidays);
    }

    @Override
    public String toString() {
        return "Calendar{" +
                "listDaysByYear=" + listWeekendDay.toString() +
                ", listHolidays=" + listHolidays.toString() +
                '}';
    }
}
