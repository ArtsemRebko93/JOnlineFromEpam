package by.jonline.module5.task4.entity;

public class Weapon extends Treasure {

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
