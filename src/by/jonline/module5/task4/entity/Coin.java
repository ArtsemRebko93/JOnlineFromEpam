package by.jonline.module5.task4.entity;

import java.io.Serializable;

public class Coin extends Treasure implements Serializable {

    private static final long serialVersionUID = 5445387440087298260L;

    public Coin() {
    }

    public Coin(String name, int price) {
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
