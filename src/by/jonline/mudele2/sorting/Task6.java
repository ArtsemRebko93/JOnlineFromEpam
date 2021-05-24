package by.jonline.mudele2.sorting;
/*
Сортировка Шелла.
 */
import java.util.Arrays;

public class Task6 {
    public static void main(String[] args) {
        int size1 = 9;
        int[] array1 = new int[size1];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = (int) (Math.random() * 10);
        }
        System.out.println(Arrays.toString(array1));
        for (int i = 0; i < array1.length; i++) {
            if (i != array1.length - 1 && array1[i] > array1[i + 1]) {
                int temp = array1[i];
                array1[i] = array1[i + 1];
                array1[i + 1] = temp;
                if (i >=1) {
                    i--;
                }
                i--;
            }

        }
        System.out.println(Arrays.toString(array1));
    }
}