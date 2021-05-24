package by.jonline.module4.task10;

import java.time.LocalTime;

public class AirlineView {

    public void printFlyNumberByDestination (Airport airport,String country) {
        for (int i = 0; i < airport.getSize(); i++) {
            if (airport.getAirlinesArray()[i].getDestination().equalsIgnoreCase(country)) {
                print(airport.getAirlinesArray()[i]);
            }
        }
    }
    public void printFlyNumberByDayOfWeek (Airport airport,DaysWeek dayOFWeek) {
        for (int i = 0; i < airport.getSize(); i++) {
            if (airport.getAirlinesArray()[i].getDay_of_week().toString().equalsIgnoreCase(dayOFWeek.toString())) {
                print(airport.getAirlinesArray()[i]);
            }
        }
    }

    public void printFlyNumberByDAyOfWeekAndCurrentTime (Airport airport,DaysWeek dayOFWeek, LocalTime time) {
        for (int i = 0; i < airport.getSize(); i++) {
            if (airport.getAirlinesArray()[i].getDay_of_week().toString().equalsIgnoreCase(dayOFWeek.toString())
                    && airport.getAirlinesArray()[i].getTime_of_startFly().isAfter(time)) {
                print(airport.getAirlinesArray()[i]);
            }
        }
    }

    private void print (Airline airline) {
        System.out.println(airline.toString());
    }
}
