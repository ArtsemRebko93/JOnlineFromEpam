package by.jonline.mudele2.arrays_of_arrays;

import java.util.Arrays;

//Сформировать квадратную матрицу порядка N по правилу:
//и подсчитать количество положительных элементов в ней.
public class Task7 {
    public static void main(String[] args) {
        double [][] doubles = new double [5][5];
        int n = 5;
        for (int row = 0; row < doubles.length; row++) {
            for (int column = 0; column < doubles[row].length; column++) {
                doubles[row][column] = Math.sin((row * row - column * column)/n);
            }
        }
        System.out.println(Arrays.deepToString(doubles));
        int counter = 0;
        for (int row = 0; row < doubles.length; row++) {
            for (int column = 0; column < doubles[row].length; column++) {
                if (doubles[row][column] > 0) {
                    counter++;
                }
            }
        }
        System.out.println(counter);
    }
}
