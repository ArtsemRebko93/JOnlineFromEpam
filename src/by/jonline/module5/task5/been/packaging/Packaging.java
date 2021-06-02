package by.jonline.module5.task5.been.packaging;

import java.util.Objects;

public abstract class Packaging {


    private TypePackaging name;
    private double price;

    public Packaging () {

    }

    public void setName(TypePackaging name) {
        this.name = name;
    }

    public Packaging (TypePackaging name) {
        this.name = name;
    }

    public String getName() {
        return name.toString();
    }

    public double getPrice() {
        return price;
    }

    void setPrice (double price) {
        this.price = price;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Packaging packaging = (Packaging) o;
        return Double.compare(packaging.price, price) == 0 &&
                Objects.equals(name, packaging.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }

    @Override
    public String toString() {
        return "Type packaging: " + name.toString() + ", price: " + price;
    }
}
