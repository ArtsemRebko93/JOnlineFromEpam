package by.jonline.module5.task5.been.flower;

import java.util.Objects;

public class Lily implements Flower {

    private final String NAME = "Lily";
    private final double PRICE = .20;


    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public double getPRICE() {
        return PRICE;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Lily lily = (Lily) o;
        return Double.compare(lily.PRICE, PRICE) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(NAME, PRICE);
    }

    @Override
    public String toString() {
        return NAME + "," + "price: " + PRICE;
    }
}
