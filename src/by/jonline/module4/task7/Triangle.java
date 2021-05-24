package by.jonline.module4.task7;

import java.util.Objects;

/*
Описать класс, представляющий треугольник.
Предусмотреть методы для создания объектов,вычисления площади, периметра и точки пересечения медиан.
 */
public class Triangle {
    private int sideA;

    public int getSideA() {
        return sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public int getSideC() {
        return sideC;
    }

    private int sideB;
    private int sideC;

    public Triangle (int sideA,int sideB, int sideC) {
        chekInCorrect(sideA,sideB,sideC);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public void chekInCorrect (int a, int b, int c) {
        if ((a + b <= c) || (a + c <= b) || (b + c <= a)) {
            throw new IllegalArgumentException("Треугольника с такими параметрами не существует");
        }
    }

    public int getSquare() {
        return (int) Math.sqrt(getPerimetr()/2 * (getPerimetr()/2 - sideA) * (getPerimetr()/2 * sideB) * (getPerimetr()/sideC));
    }

    public int getMediana() {
        return (int) ((Math.sqrt(2 * Math.pow(sideA,2) + 2 * Math.pow(sideB,2) - Math.pow(sideC,2))) / 2);
    }

    public int getPerimetr () {
        return sideA + sideB + sideC;
    }

    public static void main(String[] args) {
        Triangle triangle = new Triangle(3,5,4);
        System.out.println(triangle.getMediana());
        System.out.println(triangle.getPerimetr());
        System.out.println(triangle.getSquare());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return sideA == triangle.sideA &&
                sideB == triangle.sideB &&
                sideC == triangle.sideC;
    }

    @Override
    public int hashCode() {
        return Objects.hash(sideA, sideB, sideC);
    }
}
