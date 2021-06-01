package by.jonline.module5.task4.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Cave implements Serializable {
    private static final long serialVersionUID = 5420328010224992914L;

    public Cave () {

    }
    private static List <Treasure> treasureList = new ArrayList<>();

    public static List<Treasure> getTreasureList() {
        return treasureList;
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
