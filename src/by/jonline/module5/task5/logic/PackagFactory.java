package by.jonline.module5.task5.logic;

import by.jonline.module5.task5.been.packaging.*;

public class PackagFactory implements PackagingFactory {
    @Override
    public Packaging createPackaging(TypePackaging packaging) {
        if (packaging.equals(TypePackaging.RED_PAPER)) {
            return new RedPaperPackaging();
        } else if (packaging.equals(TypePackaging.CRAFT)) {
            return new CraftPackaging();
        } else if (packaging.equals(TypePackaging.YELLOW_PAPER)) {
            return new YellowPaperPackaging();
        } else if (packaging.equals(TypePackaging.GOLD_PAPER)) {
            return new GoldPaperPackaging();
        } else return null;
    }
}
