package by.jonline.mudele2.one_dimensional_arrays;

import java.util.Arrays;

//В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число. Если таких
//чисел несколько, то определить наименьшее из них.

public class Task9 {
    public static void main(String[] args) {
        int [] ints = new int[10];
        int [] arrayCount = new int[ints.length];
        for (int i = 0; i < ints.length; i++) {
            ints[i] = (int) (Math.random() * 10);
        }
        System.out.println(Arrays.toString(ints));
        int count = 0;
        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints.length; j++) {
                if (ints[i] == ints[j]) {
                    count++;
                }
            }
            arrayCount[i] = count;
            count = 0;
        }
        System.out.println(Arrays.toString(arrayCount));
        int max = arrayCount[0];
        for (int number: arrayCount) {
            if (max < number) {
                max = number;
            }
        }
        int min = ints[0];
        for (int i = 0; i < arrayCount.length; i++) {
            if (arrayCount[i] == max) {
                min = ints[i];
            }
        }
        System.out.println(min);
    }
}
