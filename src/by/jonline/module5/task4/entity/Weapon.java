package by.jonline.module5.task4.entity;

import java.io.Serializable;

public class Weapon extends Treasure implements Serializable {

    private static final long serialVersionUID = -4798119352061941739L;

    public Weapon() {
    }

    public Weapon(String name, int price) {
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
