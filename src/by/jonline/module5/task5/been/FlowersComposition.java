package by.jonline.module5.task5.been;

import by.jonline.module5.task5.been.flower.Flower;
import by.jonline.module5.task5.been.packaging.Packaging;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class FlowersComposition {

    private ArrayList <Flower> flowers = new ArrayList<>();
    private Packaging packaging;

    public FlowersComposition () {

    }

    public void setFlowers(Flower ... flower) {
        flowers.addAll(Arrays.asList(flower));
    }

    public void setPackaging(Packaging packaging) {
        this.packaging = packaging;
    }

    public ArrayList<Flower> getFlowers() {
        return flowers;
    }

    public Packaging getPackaging() {
        return packaging;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FlowersComposition that = (FlowersComposition) o;
        return Objects.equals(flowers, that.flowers) &&
                Objects.equals(packaging, that.packaging);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flowers, packaging);
    }

}
