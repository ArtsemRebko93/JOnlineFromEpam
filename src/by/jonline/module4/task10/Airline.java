package by.jonline.module4.task10;

/*
Создать класс Airline, спецификация которого приведена ниже.
Определить конструкторы, set- и get- методы и метод toString().
Создать второй класс, агрегирующий массив типа Airline, с подходящими конструкторами и методами.
Задать критерии выбора данных и вывести эти данные на консоль.
Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.
Найти и вывести:
a) список рейсов для заданного пункта назначения;
b) список рейсов для заданного дня недели;
c) список рейсов для заданного дня недели, время вылета для которых больше заданного.
 */

import java.time.LocalTime;
import java.util.Objects;

public class Airline {
    private String destination;
    private String flight_number;
    private TypeAirline type_airline;
    private LocalTime time_of_startFly;
    private DaysWeek day_of_week;

    public Airline(String destination, String flight_number, TypeAirline type_airline, LocalTime time_of_startFly, DaysWeek day_of_week) {
        this.destination = destination;
        this.flight_number = flight_number;
        this.type_airline = type_airline;
        this.time_of_startFly = time_of_startFly;
        this.day_of_week = day_of_week;
    }

    @Override
    public String toString() {
        return "Airline, go to " +
                "destination= " + destination + '\'' +
                ", flight_number = " + flight_number + '\'' +
                ", type_airline = " + type_airline.toString() +
                " time_of_startFly = " + time_of_startFly.toString() +
                ", day_of_week = " + day_of_week.toString();
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getFlight_number() {
        return flight_number;
    }

    public void setFlight_number(String flight_number) {
        this.flight_number = flight_number;
    }

    public TypeAirline getType_airline() {
        return type_airline;
    }

    public void setType_airline(TypeAirline type_airline) {
        this.type_airline = type_airline;
    }

    public LocalTime getTime_of_startFly() {
        return time_of_startFly;
    }

    public void setTime_of_startFly(LocalTime time_of_startFly) {
        this.time_of_startFly = time_of_startFly;
    }

    public DaysWeek getDay_of_week() {
        return day_of_week;
    }

    public void setDay_of_week(DaysWeek day_of_week) {
        this.day_of_week = day_of_week;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Airline airline = (Airline) o;
        return Objects.equals(destination, airline.destination) &&
                Objects.equals(flight_number, airline.flight_number) &&
                type_airline == airline.type_airline &&
                Objects.equals(time_of_startFly, airline.time_of_startFly) &&
                day_of_week == airline.day_of_week;
    }

    @Override
    public int hashCode() {
        return Objects.hash(destination, flight_number, type_airline, time_of_startFly, day_of_week);
    }
}
