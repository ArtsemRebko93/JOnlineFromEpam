package by.jonline.module5.task5.logic;

import by.jonline.module5.task5.been.flower.*;

public class FlowersFactory implements FlowerFactory {
    @Override
    public Flower createFlower(String name) {
        Flower flower = null;
        if (name.equalsIgnoreCase("lily")) {
            flower =  new Lily();
        } else if (name.equalsIgnoreCase("rose")) {
            flower =  new Rose();
        } else if (name.equalsIgnoreCase("chamomile")) {
            flower = new Chamomile();
        }
        return flower;
    }
}
