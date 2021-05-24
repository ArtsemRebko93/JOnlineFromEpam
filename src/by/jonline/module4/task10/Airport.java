package by.jonline.module4.task10;

import java.time.LocalTime;

public class Airport {
    Airline [] airlinesArray;
    int capacity;
    int size;

    public Airport() {
        this(10);
    }
    public int length () {
        return airlinesArray.length;
    }
    public void printAll () {
        for (int i = 0; i < size; i++) {
            System.out.println(airlinesArray[i].toString());
        }
    }

    public Airport(int capacity) {
        this.capacity = capacity;
        airlinesArray = new Airline[capacity];
    }

    public void putAirline (Airline airline) {

        if (size >= capacity) {
            Airline[] airlinesMaxCapacity = new Airline[capacity * 2];
            for (int i = 0; i < size; i++) {
                airlinesMaxCapacity[i] = airlinesArray[i];
            }
            capacity = airlinesMaxCapacity.length;
            airlinesArray = airlinesMaxCapacity;
        }
        airlinesArray[size] = airline;
        size++;
    }

    public Airline[] getAirlinesArray() {
        return airlinesArray;
    }

    public int getSize() {
        return size;
    }
}
