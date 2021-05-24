package by.jonline.mudele2.sorting;

/*
Сортировка обменами.
 */
import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        int size1 = 9;
        int[] array1 = new int[size1];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = (int) (Math.random() * 10);
        }
        System.out.println(Arrays.toString(array1));
        int counter = 0;
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1.length; j++) {
                if (array1[i] > array1[j]) {
                    int temp = array1[i];
                    array1[i] = array1[j];
                    array1[j] = temp;
                    counter++;
                }
            }
        }
        System.out.println(counter);
        System.out.println(Arrays.toString(array1));
    }
}
