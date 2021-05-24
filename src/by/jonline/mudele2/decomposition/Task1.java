package by.jonline.mudele2.decomposition;

public class Task1 {
    public static int Nok (int a, int b) {
        int nok = 1;
        if (a >= b) {
            for (int i = a * b; i >= a ; i--) {
                if (i % a == 0 && i % b == 0) {
                    nok = i;
                }
            }
        } else {
            for (int i = a * b; i >= b; i--) {
                if (i % a == 0 && i % b == 0) {
                    nok = i;
                }
            }
        }
        return nok;
    }
    public static int Nod (int a, int b) {
        int nod = 1;
        if (a >= b) {
            for (int i = 2; i <= b; i++) {
                if (a % i == 0 && b % i == 0) {
                    nod = i;
                }
            }
        } else {
            for (int i = 2; i <= a; i++) {
                if (a % i == 0 && b % i == 0) {
                    nod = i;
                }
            }
        }
        return nod;
    }
}
