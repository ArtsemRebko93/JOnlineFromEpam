package by.jonline.mudele2.one_dimensional_arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем отрицательных,
//положительных и нулевых элементов.

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Введите размер массива: ");
        int size = scanner.nextInt();
        int [] ints = new int[size];
        for (int i = 0; i < ints.length; i++) {
            ints [i] = random.nextInt();
        }
        System.out.println(Arrays.toString(ints));
        int positiv = 0;
        int negative = 0;
        int numberNull = 0;
        for (int number: ints) {
            if (number > 0) {
                positiv++;
            } else if (number < 0) {
                negative++;
            } else if (number == 0) {
                numberNull++;
            }
        }
        System.out.println("Положительных - " + positiv);
        System.out.println("Отрицательных - " + negative);
        System.out.println("Нулей - " + numberNull);
    }
}
