package by.jonline.module5.task4.logic;

import by.jonline.module5.task4.entity.*;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class DaoLogic {

    public Cave donloadCave () {
        Cave cave = new Cave();
        try {
            FileReader reader = new FileReader("src/by/jonline/module5/task4/dao/Treasure.txt");
            Scanner scanner = new Scanner(reader);
            while (scanner.hasNextLine()) {
                String [] treasureLine = scanner.nextLine().split("/");
                String treasureType = treasureLine[0];
                String treasureName = treasureLine[1];
                int price = Integer.parseInt(treasureLine[2]);
                switch (treasureType) {
                    case "Weapon" :
                        Cave.getTreasureList().add(new Weapon(treasureName,price));
                    case "Relic":
                        Cave.getTreasureList().add(new Relic(treasureName,price));
                    case "Vase":
                        Cave.getTreasureList().add(new Vase(treasureName,price));
                    case "Stone":
                        Cave.getTreasureList().add(new Stone(treasureName,price));
                    case "Coin":
                        Cave.getTreasureList().add(new Coin(treasureName,price));
                    case "Necklace":
                        Cave.getTreasureList().add(new Necklace(treasureName,price));
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return cave;
    }
}
