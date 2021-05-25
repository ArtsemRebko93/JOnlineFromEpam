package by.jonline.module5.task4.view;

import by.jonline.module5.task4.entity.Cave;
import by.jonline.module5.task4.entity.Treasure;

import java.util.List;

public class CaveView {
    public void showAllTreasures () {
        for (Treasure element: Cave.getTreasureList()) {
            System.out.println(element.toString());
        }
    }

    public void showListOfTreasure (List <Treasure> treasures) {
        for (Treasure element: treasures) {
            System.out.println(element.toString() + element.getClass());
        }
    }
}
