package by.jonline.module4.task4;

public class Depo {
    private static Train [] trains = new Train[5];
    private int countOfTrain = 0;

    public Depo () {}

    public void addTrain(Train train) {
        if (countOfTrain < 5) {
            trains[countOfTrain] = train;
            countOfTrain++;
        } else throw new ArrayIndexOutOfBoundsException("Максимум 5 поездов в депо.");
    }

    public Train[] getTrains() {
        return trains;
    }
}
