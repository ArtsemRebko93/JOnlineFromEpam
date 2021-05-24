package by.jonline.mudele2.one_dimensional_arrays;

import java.util.Arrays;

// Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i.
public class Task5 {
    public static void main(String[] args) {
        int [] ints = new int[10];
        for (int i = 0; i < ints.length; i++) {
            ints[i] = (int) (Math.random() * 10);
        }
        System.out.println(Arrays.toString(ints));
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] > i) {
                System.out.print(ints[i] + " ");
            }
        }
    }
}
