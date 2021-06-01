package by.jonline.module5.task4.entity;

import java.io.Serializable;

public class Necklace extends Treasure implements Serializable {

    private static final long serialVersionUID = -5137021683679883815L;

    public Necklace() {
    }

    public Necklace(String name, int price) {
        super(name, price);
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
