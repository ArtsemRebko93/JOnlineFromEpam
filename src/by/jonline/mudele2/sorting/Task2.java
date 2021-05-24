package by.jonline.mudele2.sorting;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int size1 = 5;
        int size2 = 8;
        int[] array1 = new int[size1];
        int[] array2 = new int[size2];
        int[] array3 = new int[size1 + size2];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = (int) (Math.random() * 10);
        }
        System.out.println(Arrays.toString(array1));
        Arrays.sort(array1);
        for (int i = 0; i < array2.length; i++) {
            array2[i] = (int) (Math.random() * 10);
        }
        System.out.println(Arrays.toString(array2));
        Arrays.sort(array2);
        for (int i = 0; i < array1.length; i++) {
            array3[i] = array1[i];
        }
        for (int i = 0; i < array2.length; i++) {
            array3[array3.length - i - 1] = array2[array2.length - i - 1];
        }
        System.out.println(Arrays.toString(array3));
    }
}
