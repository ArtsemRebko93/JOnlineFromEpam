package by.jonline.mudele2.one_dimensional_arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//Дана последовательность действительных чисел а1 ,а2 ,..., ап. Заменить все ее члены, большие данного Z, этим
//числом. Подсчитать количество замен.

public class Task2 {
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
        System.out.println("Введите число, на которое будем менять элементы массива по" +
                "заданному критерию: ");
        int number = scanner.nextInt();
        int count = 0;
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] > number) {
                ints[i] = number;
                count++;
            }
        }
        System.out.println(Arrays.toString(ints));
        System.out.println("Кол-во замен - " + count);
    }
}
