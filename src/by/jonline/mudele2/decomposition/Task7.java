package by.jonline.mudele2.decomposition;

public class Task7 {
    public static int factorial (int max) {
        int sum = 0;
        int fact = 1;
        for (int i = 1; i <= max ; i = i + 2) {
            for (int j = 1; j <= i; j++) {
                 fact *= j;
            }
            sum += fact;
            fact = 1;
        }
        return sum;
    }
}
