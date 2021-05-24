package by.jonline.mudele2.one_dimensional_arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Введите размер массива: ");
        int size = scanner.nextInt();
        int [] ints = new int[size];
        for (int i = 0; i < ints.length; i++) {
            ints [i] = random.nextInt(10);
        }
        System.out.println(Arrays.toString(ints));
        System.out.println("Введите число, которому должен быть кратен элемент массива: ");
        int delitel = scanner.nextInt();
        for (int number: ints) {
            if (number % delitel == 0 && number != 0) {
                System.out.print(number + " ");
            }
        }
    }
}
