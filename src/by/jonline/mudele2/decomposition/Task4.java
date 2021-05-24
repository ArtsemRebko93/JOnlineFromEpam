package by.jonline.mudele2.decomposition;

//На плоскости заданы своими координатами n точек.
// Написать метод(методы), определяющие, между какими из пар точек самое большое расстояние.
// Указание. Координаты точек занести в массив.

public class Task4 {

    public static int [] show_tochky (int [][] massive) {
        return massive[show_position_tochki(massive)];
    }

    private static int show_position_tochki(int [][] massive) {
        int max = 0;
        int i = massive.length - 1;
        int i_max = massive.length - 1;
        max = show_most_distance(massive[i]);
        while (i > 0) {
            if (show_most_distance(massive[i_max]) < show_most_distance(massive[i - 1])) {
                i_max = i - 1;
                max = show_most_distance(massive[i_max]);

            }
            i--;
        }
        return i_max;
    }

    private static int show_most_distance (int [] massive) {
        int counter = Math.abs(massive[0] - massive[massive.length - 1]);
       return counter;
    }

}
