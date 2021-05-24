package by.jonline.mudele2.arrays_of_arrays;

import java.util.Arrays;
import java.util.Scanner;

//Дана матрица. Вывести k-ю строку и p-й столбец матрицы.

public class Task3 {
    public static void main(String[] args) {
        int k, p;
        int [][] ints = new int[3][6];
        for (int row = 0; row < ints.length; row++) {
            for (int column = 0; column < ints[row].length; column++) {
                ints[row][column] = (int) (Math.random() * 10);
            }
        }
        for (int row = 0; row < ints.length; row++) {
            for (int column = 0; column < ints[row].length; column++) {
                System.out.print(ints[row][column] + " ");
            }
            System.out.println();
        }
        Scanner scanner = new Scanner(System.in);
        int row;
        do {
            System.out.println("Enter row: ");
            row = scanner.nextInt();
        } while (row < 0 || row >= ints.length);
        int column;
        do {
            System.out.println("Enter column: ");
            column = scanner.nextInt();
        } while (column < 0 || column >= 6);
        System.out.println(Arrays.toString(ints[row]));
        for (int i = 0; i < ints.length; i++) {
            System.out.print(ints[i][column] + " ");
        }
    }
}
