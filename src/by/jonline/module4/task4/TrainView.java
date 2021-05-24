package by.jonline.module4.task4;

public class TrainView {

    public void showInfoAboutAll (Depo depo) {
        for (Train train: depo.getTrains()) {
            System.out.println(train.toString());
        }
    }

    public void showInfoAboutTrain (int numberOFTrain, Depo depo) {
        for (Train train: depo.getTrains()) {
            if (train.getNumberOfTrain() == numberOFTrain) {
                System.out.println(train.toString());
            }
        }
    }

}
