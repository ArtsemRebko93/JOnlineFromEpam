package by.jonline.module4.task10;


import java.time.LocalTime;

public class Test {
    public static void main(String[] args) {

        Airline boeing = new Airline("Moscow","756B",TypeAirline.PassengersAirline,LocalTime.of(12,12,12),DaysWeek.WEDNESDAY);
        Airline airbus = new Airline("Praga","678A",TypeAirline.ComersAirline,LocalTime.of(13,15,20),DaysWeek.FRIDAY);
        Airline il = new Airline("California","777",TypeAirline.WarAirline,LocalTime.of(12,0,0),DaysWeek.MONDAY);
        Airport airport = new Airport();
        airport.putAirline(boeing);
        airport.putAirline(airbus);
        airport.putAirline(il);
        airport.putAirline(il);
        airport.putAirline(il);
        System.out.println(airport.length());
        AirlineView view = new AirlineView();
        view.printFlyNumberByDayOfWeek(airport,DaysWeek.FRIDAY);
        System.out.println();
        view.printFlyNumberByDestination(airport,"moscow");
        System.out.println();
        view.printFlyNumberByDAyOfWeekAndCurrentTime(airport,DaysWeek.FRIDAY,LocalTime.of(12,12,12));


    }
}
