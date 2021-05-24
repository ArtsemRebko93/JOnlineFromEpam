package by.jonline.mudele2.decomposition;

import java.util.Random;

//сумма элементов массива равна k, но элемент массива не больше n
public class Task12 {
    public static int [] specific_massive (int k, int n, int size) {
        Random random = new Random();
        int [] massive = new int[size];
        for (int i = 0; i < massive.length; i++) {
            do {
                massive[i] = random.nextInt(n);
            } while (!(sum_chisel(massive[i]) == k));
        }
        return massive;
    }
    private static int sum_chisel (int number) {
        int sum = 0;
        int ostatok;
        while (number > 0) {
            ostatok = number % 10;
            sum += ostatok;
            number /= 10;
        }
        return sum;
    }
}
