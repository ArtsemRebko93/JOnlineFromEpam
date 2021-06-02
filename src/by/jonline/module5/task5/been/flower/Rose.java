package by.jonline.module5.task5.been.flower;

import java.util.Objects;

public class Rose implements Flower {

    private final String NAME = "Rose";
    private final double PRICE = .30;


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
        Rose rose = (Rose) o;
        return Double.compare(rose.PRICE, PRICE) == 0;
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
