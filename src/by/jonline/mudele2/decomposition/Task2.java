package by.jonline.mudele2.decomposition;

import java.util.Arrays;

public class Task2 {
    public static int Nod_four (int a, int b, int c, int d) {
        int [] array = new int[4];
        array[0] = a;
        array[1] = b;
        array[2] = c;
        array[3] = d;
        Arrays.sort(array);
        int nod = 1;
        for (int i = 1; i <= array[0]; i++) {
            if (a % i == 0 && b % i == 0 && c % i == 0 && d % i == 0) {
                nod = i;
            }
        }
        return nod;
    }
}
