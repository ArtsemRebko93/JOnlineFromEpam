package by.jonline.mudele2.sorting;

/*

 */
import java.util.Arrays;

public class Task1 {
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
        for (int i = 0; i < array2.length; i++) {
            array2[i] = (int) (Math.random() * 10);
        }
        System.out.println(Arrays.toString(array2));
        for (int i = 0; i < array1.length; i++) {
            array3[i] = array1[i];
        }
        int k = 3;
        for (int i = 0; i < array2.length; i++) {
            if (k + array2.length < array3.length) {
                array3[k + array2.length] = array3[k];
            }
            array3[k] = array2[i];
            k++;
        }
        System.out.println(Arrays.toString(array3));
    }
}