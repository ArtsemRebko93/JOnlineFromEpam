package by.jonline.mudele2.arrays_of_arrays;

import java.util.Random;

//Матрицу 10x20 заполнить случайными числами от 0 до 15. Вывести на экран саму матрицу и номера строк, в
//которых число 5 встречается три и более раз.

public class Task11 {
    public static void main(String[] args) {
        int [][] ints = new int[10][20];
        Random random = new Random();
        for (int row = 0; row < ints.length; row++) {
            for (int column = 0; column < ints[row].length; column++) {
                ints[row][column] = random.nextInt(15);
            }
        }
        for (int row = 0; row < ints.length; row++) {
            for (int column = 0; column < ints[row].length; column++) {
                System.out.print(ints[row][column] + " ");
            }
            System.out.println();
        }
        int counter = 0;
        for (int row = 0; row < ints.length; row++) {
            for (int column = 0; column < ints[row].length; column++) {
                if (ints[row][column] == 5) {
                    counter++;
                }
            }
            if (counter >= 3) {
                System.out.println("Строка с числом пяторок больше 3х: " + row);
            }
            counter = 0;
        }
    }
}
