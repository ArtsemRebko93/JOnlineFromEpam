package by.jonline.module4.agregation.task3;

public class City {
    private boolean centerRegion;
    private CityName name;
    private double square;

    public City (CityName name,boolean centerRegion) {
        this.name = name;
        this.centerRegion = centerRegion;
    }

    public boolean isCenter() {
        return centerRegion;
    }

    public City (CityName name) {
        this.name = name;
    }

    public void getSquare () {
        square = name.square;
    }

    @Override
    public String toString() {
        return "City " + name;
    }
}
