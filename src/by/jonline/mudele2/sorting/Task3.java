package by.jonline.mudele2.sorting;
/*
Сортировка выбором.
 */
import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int size1 = 9;
        int[] array1 = new int[size1];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = (int) (Math.random() * 10);
        }
        System.out.println(Arrays.toString(array1));
        for (int i = 0; i < array1.length; i++) {
            int pos = i;
            int max = array1[i];
            for (int j = i + 1; j < array1.length; j++) {
                if (max < array1[j]) {
                    pos = j;
                    max = array1[j];
                }
            }
            array1[pos] = array1[i];
            array1[i] = max;
        }

        System.out.println(Arrays.toString(array1));
    }
}
