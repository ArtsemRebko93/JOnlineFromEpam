package by.jonline.module4.task4;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Train train1 = new Train("Moscow",23,new GregorianCalendar(2021,Calendar.APRIL,06,12,12,30));
        Train train2 = new Train("Saint-Peterburg",33,new GregorianCalendar(2021,Calendar.APRIL,12,13,12,30));
        Train train3 = new Train("Minsk",12,new GregorianCalendar(2021,Calendar.APRIL,6,14,31,30));
        Train train4 = new Train("Zhlobin",17,new GregorianCalendar(2021,Calendar.APRIL,6,15,27,33));
        Train train5 = new Train("Gomel",13,new GregorianCalendar(2021,Calendar.APRIL,6,12,49,30));
        Depo depo = new Depo();
        depo.addTrain(train1);
        depo.addTrain(train2);
        depo.addTrain(train3);
        depo.addTrain(train4);
        depo.addTrain(train5);
        TrainLogic trainLogic = new TrainLogic();
        TrainView view = new TrainView();
        trainLogic.sortedTrainsByCity(depo);
        view.showInfoAboutAll(depo);
        System.out.println();
        trainLogic.sortedTrainsByNumber(depo);
        view.showInfoAboutAll(depo);
        System.out.println();
        view.showInfoAboutTrain(17,depo);


    }
}
