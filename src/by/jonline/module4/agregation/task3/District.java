package by.jonline.module4.agregation.task3;

public class District {

    private int squareDistrict;
    private final String NAME_DISTRICT;


    public District(String name) {
        NAME_DISTRICT = name;
    }

    @Override
    public String toString() {
        return "NAME_DISTRICT='" + NAME_DISTRICT + '\'' +
                '}';
    }
}
