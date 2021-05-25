package by.jonline.module5.task4.menu;

import by.jonline.module5.task4.Main;
import by.jonline.module5.task4.logic.CaveLogic;
import by.jonline.module5.task4.view.CaveView;

import java.util.Scanner;

public class TreasureByPriceMenu {

    private CaveLogic logic = new CaveLogic();
    private CaveView view = new CaveView();

    public void show () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter minimal price:");
        view.showListOfTreasure(logic.getListTresureByPrice(scanner.nextInt()));
    }
}
