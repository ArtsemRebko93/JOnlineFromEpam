package by.jonline.module4.task4;

public class TrainLogic {

    public void sortedTrainsByNumber (Depo depo) {
        for (int i = 0; i < depo.getTrains().length; i++) {
            for (int j = 0; j < depo.getTrains().length; j++) {
                if (depo.getTrains()[i].getNumberOfTrain() < depo.getTrains()[j].getNumberOfTrain() && i != j) {
                    Train train = depo.getTrains()[i];
                    depo.getTrains()[i] = depo.getTrains()[j];
                    depo.getTrains()[j] = train;
                }
            }
        }
    }

    private char fistChar (String str) {
        char [] chars = str.toCharArray();
        return chars[0];
    }

    public void sortedTrainsByCity (Depo depo) {
        for (int i = 0; i < depo.getTrains().length; i++) {
            for (int j = 0; j < depo.getTrains().length; j++) {
                if (fistChar(depo.getTrains()[i].getFinishCity().toLowerCase()) < fistChar(depo.getTrains()[j].getFinishCity().toLowerCase()) && i != j) {
                    Train train = depo.getTrains()[i];
                    depo.getTrains()[i] = depo.getTrains()[j];
                    depo.getTrains()[j] = train;
                } else if (fistChar(depo.getTrains()[i].getFinishCity().toLowerCase()) == fistChar(depo.getTrains()[j].getFinishCity().toLowerCase()) && i != j) {
                    if (depo.getTrains()[i].getDateOfStart().getTimeInMillis() < depo.getTrains()[j].getDateOfStart().getTimeInMillis()) {
                        Train train = depo.getTrains()[i];
                        depo.getTrains()[i] = depo.getTrains()[j];
                        depo.getTrains()[j] = train;
                    }
                }
            }
        }
    }
}
