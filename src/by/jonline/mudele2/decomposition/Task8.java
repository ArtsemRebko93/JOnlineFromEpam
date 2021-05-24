package by.jonline.mudele2.decomposition;

public class Task8 {
    public static int sum_three_elem (int [] massive, int k, int m) {
        int sum = 0;
        for (int i = k; i <= m; i++) {
            sum += massive[i];
        }
        return sum;
    }
}
