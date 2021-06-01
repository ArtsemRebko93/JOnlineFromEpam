package by.jonline.module5.task4.entity;

import java.io.Serializable;

public class Vase extends Treasure implements Serializable {

    private static final long serialVersionUID = -1186532193436082113L;

    public Vase() {
    }

    public Vase(String name, int price) {
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
