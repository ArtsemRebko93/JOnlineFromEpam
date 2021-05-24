package by.jonline.mudele2.decomposition;

public class Task11 {
    public static int chto_bolshe (int a, int b) {
        int chislo = a;
        int count = 0;
        int chislo1 = b;
        int count1 = 0;
        do {
            count++;
            chislo = chislo/10;
            if (chislo == 0) {
                count--;
            }
            count1++;
            chislo1 = chislo1/10;
            if (chislo1 == 0) {
                count1--;
            }
        } while (chislo > 0 || chislo1 > 0);
        if (count > count1) {
            return a;
        } else return b;
    }
}
