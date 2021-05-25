package by.jonline.module5.task4.logic;

import by.jonline.module5.task4.entity.Cave;
import by.jonline.module5.task4.entity.Treasure;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CaveLogic {
    public Treasure getMostExpensiveTreasure () {
        Treasure treasure = null;
        int hightPrice = 0;
        for (Treasure element: Cave.getTreasureList()) {
            if (element.getPrice() > hightPrice) {
                treasure = element;
                hightPrice = element.getPrice();
            }
        }
        return treasure;
    }

    public List <Treasure> getListTresureByPrice (int price) {
        Set <Treasure> list1 = new HashSet<>();
        for (Treasure element: Cave.getTreasureList()) {
            if (element.getPrice() > price && !list1.equals(element)) {
                list1.add(element);
            }
        }
        return new ArrayList<>(list1);
    }
}
