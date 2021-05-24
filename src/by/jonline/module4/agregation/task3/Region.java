package by.jonline.module4.agregation.task3;

public class Region {

    private final String REGION;

    public Region (String region) {
        REGION = region;
    }

    @Override
    public String toString() {
        return "REGION= " + REGION + '\'' +
                '}';
    }
}
