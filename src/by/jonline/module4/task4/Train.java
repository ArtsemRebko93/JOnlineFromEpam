package by.jonline.module4.task4;
/* Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления.
Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива по номерам поездов.
Добавьте возможность вывода информации о поезде, номер которого введен пользователем.
Добавьте возможность сортировки массив по пункту назначения,
 причем поезда с одинаковыми пунктами назначения должны быть упорядочены по времени отправления. */

import java.util.Calendar;
import java.util.Objects;

public class Train {

    private String finishCity;
    private int numberOfTrain;
    private Calendar dateOfStart;

    public Train(String finishCity, int numberOFTrain, Calendar dateOfStart) {
        this.finishCity = finishCity;
        this.numberOfTrain = numberOFTrain;
        this.dateOfStart = dateOfStart;
    }

    public String getFinishCity() {
        return finishCity;
    }



    public int getNumberOfTrain() {
        return numberOfTrain;
    }

    public Calendar getDateOfStart() {
        return dateOfStart;
    }

    @Override
    public String toString() {
        return "Поезд №" + numberOfTrain +
                " следует до " + finishCity +
                ", время отправления " + dateOfStart.getTime() + ".";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Train train = (Train) o;
        return numberOfTrain == train.numberOfTrain &&
                Objects.equals(finishCity, train.finishCity) &&
                Objects.equals(dateOfStart, train.dateOfStart);
    }

    @Override
    public int hashCode() {
        return Objects.hash(finishCity, numberOfTrain, dateOfStart);
    }
}
