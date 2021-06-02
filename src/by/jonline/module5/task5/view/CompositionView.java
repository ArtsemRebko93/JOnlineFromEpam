package by.jonline.module5.task5.view;

import by.jonline.module5.task5.been.FlowersComposition;
import by.jonline.module5.task5.been.flower.Flower;

public class CompositionView {

    public void print (FlowersComposition composition) {
        StringBuilder builder = new StringBuilder("");
        for (Flower flower: composition.getFlowers()) {
            builder.append(flower.toString());
            builder.append(".\n");
        }
        builder.append(composition.getPackaging().toString());
        builder.append(".");
        System.out.println(builder.toString());
    }

}
