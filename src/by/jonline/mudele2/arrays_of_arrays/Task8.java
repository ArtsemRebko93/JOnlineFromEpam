package by.jonline.mudele2.arrays_of_arrays;

import java.util.Scanner;

//В числовой матрице поменять местами два столбца любых столбца, т. е. все элементы одного столбца поставить
//на соответствующие им позиции другого, а его элементы второго переместить в первый. Номера столбцов вводит
//пользователь с клавиатуры.

public class Task8 {
    public static void main(String[] args) {
        int [][] ints = new int[5][5];
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
        int first = 0;
        int second = 0;
        do {
            System.out.println("Введите номер столбца под замену: ");
            first = scanner.nextInt();
            System.out.println("Введите номер столбца, с которым будем менять: ");
            second = scanner.nextInt();
        } while ((first < 0 || first >= ints.length) && (second < 0 || second >= ints.length));
        int swap;
        for (int row = 0; row < ints.length; row++) {
            for (int column = 0; column < ints[row].length; column++) {
                if (column == first) {
                    swap = ints[row][column];
                    ints[row][column] = ints[row][second];
                    ints[row][second] = swap;
                }
            }
        }
        for (int row = 0; row < ints.length; row++) {
            for (int column = 0; column < ints[row].length; column++) {
                System.out.print(ints[row][column] + " ");
            }
            System.out.println();
        }

    }
}
