package by.jonline.module5.task4.entity;

import java.io.Serializable;

public class Stone extends Treasure implements Serializable {

    private static final long serialVersionUID = 2821259258681014957L;

    public Stone() {
    }

    public Stone(String name, int price) {
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
