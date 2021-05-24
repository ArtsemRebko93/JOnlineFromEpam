package by.jonline.mudele2.one_dimensional_arrays;

import java.util.Arrays;

//Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы.

public class Task4 {
    public static void main(String[] args) {
        double [] doubles = new double [8];
        doubles[0] = 2.1;
        doubles[1] = 5.2;
        doubles[2] = 8.3;
        doubles[3] = 25.3;
        doubles[4] = 4;
        doubles[5] = 1.2;
        doubles[6] = 14;
        doubles[7] = 23;
        double swap = 0;
        int positionMax = 0;
        double metca = doubles[0];
        int positionMin = 0;
        for (int i = 0; i < doubles.length; i++) {
            if (doubles[i] > metca) {
                positionMax = i;
            }
            if (doubles[i] < metca) {
                positionMin = i;
            }
        }
        swap = doubles[positionMax];
        doubles[positionMax] = doubles[positionMin];
        doubles[positionMin] = swap;
        System.out.println(Arrays.toString(doubles));
    }
}
