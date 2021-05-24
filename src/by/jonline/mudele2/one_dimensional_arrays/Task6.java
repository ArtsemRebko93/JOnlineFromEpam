package by.jonline.mudele2.one_dimensional_arrays;

import java.util.Arrays;

//Задана последовательность N вещественных чисел. Вычислить сумму чисел, порядковые номера которых
//являются простыми числами.

public class Task6 {
    public static void main(String[] args) {
        int [] ints = new int[15];
        int sum = 0;
        for (int i = 0; i < ints.length; i++) {
            ints[i] = (int) (Math.random() * 10);
        }
        System.out.println(Arrays.toString(ints));
        boolean ok;
        for (int i = 0; i < ints.length; i++) {
            ok = true;
            if (i == 1 || i == 2) {
                sum += ints[i];
                continue;
            }
            for (int j = 0; j < ints.length / 2; j++) {
                if (j == 0 || j == 1) {
                    continue;
                } else if (i != j && i % j == 0) {
                    ok = false;
                    break;
                }
            }
            if (ok) {
                sum+= ints[i];
            }
        }
        System.out.println(sum);
    }
}
