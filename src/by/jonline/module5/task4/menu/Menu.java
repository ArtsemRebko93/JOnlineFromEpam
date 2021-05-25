package by.jonline.module5.task4.menu;

import by.jonline.module5.task4.logic.CaveLogic;
import by.jonline.module5.task4.view.CaveView;

import java.util.Scanner;

public class Menu {
    CaveLogic logic = new CaveLogic();
    CaveView view = new CaveView();
    TreasureByPriceMenu byPriceMenu = new TreasureByPriceMenu();
    public void showMenu () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welom to our Cave with Treasure\n" +
                "Pls, choose your action:\n" +
                "1 - Show all Treasure\n" +
                "2 - Show most expensive Treasure\n" +
                "3 - Show treasures by minimal price\n" +
                "4 - Exit");
        switch (scanner.nextLine()) {
            case "1":
                view.showAllTreasures();
                break;
            case "2":
                System.out.println(logic.getMostExpensiveTreasure().toString());
                break;
            case "3":
                byPriceMenu.show();
                break;
        }
    }
}
