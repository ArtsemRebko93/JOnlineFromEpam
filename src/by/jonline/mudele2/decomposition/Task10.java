package by.jonline.mudele2.decomposition;

public class Task10 {
    public static int [] massive_from_chislo (int x) {
        int chislo = x;
        int count = 0;
        do {
            count++;
            chislo = chislo/10;
        } while (chislo > 0);
        int [] massive = new int[4];
        for (int i = 0; i < 4; i++) {
            massive[i] = x % 10;
            x = x/10;
        }
        return massive;
    }
}
