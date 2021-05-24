package by.jonline.module4.agregation.task3;
/*
Создать объект класса Государство, используя классы Область, Район, Город.
 Методы: вывести на консоль столицу, количество областей, площадь, областные центры.
 */

import java.util.ArrayList;
import java.util.List;

public class State {

    private final String CAPITAL = "MINSK";
    private int squareState = 207_600;
    private List <Region> region = new ArrayList<>();
    private List <District> district = new ArrayList<>();
    private List <City> city = new ArrayList<>();

    public void addRegion(Region region) {
        this.region.add(region);
    }

    public void addDistrict(District district) {
        this.district.add(district);
    }

    public void addCity (City city) {
        this.city.add(city);
    }

    public int getSquareState() {
        return squareState;
    }

    public void printAllRegionCenter () {

        for (City regionCity: city) {
            if (regionCity.isCenter()) {
                System.out.println(regionCity.toString());
            }
        }
    }

    public void printCountRegion () {
        System.out.println(region.size());
    }

    public void printCapital () {
        System.out.println(CAPITAL);
    }

    @Override
    public String toString() {
        return "State{" +
                "CAPITAL='" + CAPITAL + '\'' +
                ", squareState=" + squareState +
                '}';
    }
}
