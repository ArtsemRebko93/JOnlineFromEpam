package by.jonline.module5.task5.logic;

import by.jonline.module5.task5.been.FlowersComposition;
import by.jonline.module5.task5.been.flower.Flower;

public class FlowersCompositionLogic {

    public double getTotalPrice (FlowersComposition composition) {
        double sumPrice = 0;
        for (Flower flower: composition.getFlowers()) {
            sumPrice += flower.getPRICE();
        }
        return sumPrice + composition.getPackaging().getPrice();
    }

}
