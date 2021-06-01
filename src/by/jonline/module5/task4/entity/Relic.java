package by.jonline.module5.task4.entity;

import java.io.Serializable;

public class Relic extends Treasure implements Serializable {

    private static final long serialVersionUID = -8851678907973468590L;

    public Relic() {
    }

    public Relic(String name, int price) {
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
