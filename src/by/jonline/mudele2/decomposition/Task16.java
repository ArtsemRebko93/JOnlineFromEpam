package by.jonline.mudele2.decomposition;

//Написать программу, определяющую сумму n - значных чисел,
//содержащих только нечетные цифры. Определить также, сколько четных цифр в найденной сумме.
// Для решения задачи использовать декомпозицию.

public class Task16 {
    public static void show_summa_and_chisel_chetnuh(int razrad) {
        for (int i = (int) Math.pow(10,razrad - 1); i < Math.pow(10,razrad); i++) {
            if (proverka_na_nechetnost(i)) {
                pechat(i);
                pechat(summa(i));
                pechat(show_kol_vo_chetnuh(summa(i)));
                System.out.println();
            }
        }


    }
    private static int show_kol_vo_chetnuh(int number) {
        int counter = 0;
        int first = number % 10;
        while (number != 0) {
            if (first % 2 == 0) {
                counter ++;
            }
            number = number / 10;
            first = number % 10;
        }
        return counter;
    }

    private static int summa (int number) {
        int summa = 0;
        int first = number % 10;
        while (number != 0) {
            summa+=first;
            number = number / 10;
            first = number % 10;
        }
        return summa;
    }


    private static boolean proverka_na_nechetnost(int number) {
        boolean show = true;
        int first = number % 10;
        while (number != 0) {
            if (first % 2 == 0) {
                show = false;
                break;
            }
            number = number / 10;
            first = number % 10;
        }
        return show;
    }

    private static void pechat (int number) {
        System.out.println(number);
    }
}
