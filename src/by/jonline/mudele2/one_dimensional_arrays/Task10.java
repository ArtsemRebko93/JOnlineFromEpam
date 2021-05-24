package by.jonline.mudele2.one_dimensional_arrays;

import java.util.Arrays;

//Дан целочисленный массив с количеством элементов п. Сжать массив, выбросив из него каждый второй
//элемент (освободившиеся элементы заполнить нулями). Примечание. Дополнительный массив не использовать.

public class Task10 {
    public static void main(String[] args) {
        int [] ints = new int[10];
        for (int i = 0; i < ints.length; i++) {
            ints[i] = (int) (Math.random() * 10);
        }
        System.out.println(Arrays.toString(ints));
        for (int i = 0; i < ints.length; i++) {
            if (i % 2 != 0) {
                ints[i] = 0;
            }
        }
        System.out.println(Arrays.toString(ints));
    }
}
