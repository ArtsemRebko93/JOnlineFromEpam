package by.jonline.module5.task4.entity;

import java.util.ArrayList;
import java.util.List;

public class Cave {
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
