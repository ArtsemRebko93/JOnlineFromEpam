package by.jonline.module4.task5;

import java.util.Objects;

/*
 Опишите класс, реализующий десятичный счетчик,
 который может увеличивать или уменьшать свое значение на единицу в заданном диапазоне.
 Предусмотрите инициализацию счетчика значениями по умолчанию и произвольными значениями.
 Счетчик имеет методы увеличения и уменьшения состояния, и метод позволяющее получить его текущее состояние.
 Написать код, демонстрирующий все возможности класса.
 */
public class Counter {
    private final int MAX_COUNT = 10;
    private int currentCount;

    public Counter () {

    }

    public Counter(int currentCount) {
        if (currentCount < 0 || currentCount >= MAX_COUNT) {
                throw new IllegalArgumentException("Not available value.");
            }
        else {
            this.currentCount = currentCount;
        }
    }

    public void add () {
        if (currentCount < MAX_COUNT) {
            currentCount++;
        } else  {
            throw new IllegalStateException("Максимальное значение счетчика.");
        }
    }

    public void minus () {
        if (currentCount != 0) {
            currentCount--;
        } else  {
            throw new IllegalStateException("Значение счетчика - 0");
        }
    }

    public void getCurrentCount() {
        System.out.println(currentCount);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Counter counter = (Counter) o;
        return MAX_COUNT == counter.MAX_COUNT &&
                currentCount == counter.currentCount;
    }

    @Override
    public int hashCode() {
        return Objects.hash(MAX_COUNT, currentCount);
    }
}
