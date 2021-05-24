package by.jonline.mudele2.one_dimensional_arrays;

import java.util.Arrays;

//Дана последовательность целых чисел a1 to an . Образовать новую последовательность, выбросив из
//исходной те члены, которые равны min(a1....an)
public class Task8 {
    public static void main(String[] args) {
        int[] ints = {10, -2, 19, 4, -10, 8, 22, -15, 99, -23};
        int count = 0;
        int min = ints[0];
        for (int number : ints) {
            if (min > number) {
                min = number;
            }
        }
        for (int i = 0; i < ints.length; i++) {
            if (min >= ints[i]) {
                count++;
            }
        }
        int index = 0;
        int[] ints1 = new int[ints.length - count];
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] > min) {
                ints1[index++] = ints[i];
            }
        }
        System.out.println(Arrays.toString(ints1));
    }
}
