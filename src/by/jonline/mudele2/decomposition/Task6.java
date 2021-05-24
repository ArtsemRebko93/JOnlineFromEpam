package by.jonline.mudele2.decomposition;

import java.util.Arrays;

public class Task6 {
    public static boolean Vsaimnoprostoe_three(int a, int b, int c) {
        int[] array = new int[3];
        array[0] = a;
        array[1] = b;
        array[2] = c;
        Arrays.sort(array);
        int nod = 1;
        for (int i = 1; i <= array[0]; i++) {
            if (a % i == 0 && b % i == 0 && c % i == 0) {
                nod = i;
            }
        }
        if (nod == 1) {
            return true;

        } else return false;
    }
}
