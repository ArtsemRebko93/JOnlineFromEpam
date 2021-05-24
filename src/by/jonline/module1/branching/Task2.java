package by.jonline.module1.branching;

// Найти max{min(a, b), min(c, d)}.

public class Task2 {
    public static void main(String[] args) {
        int a = 12;
        int b = 17;
        int c = 13;
        int d = 19;
        System.out.println(Task2.max(Task2.min(a,b),Task2.min(c,d)));

    }
    public static int max (int a, int b) {
        if (a >= b) {
            return a;
        } else {
            return b;
        }
    }
    public static int min (int a, int b) {
        if (a >= b) {
            return b;
        } else {
            return a;
        }
    }
}
