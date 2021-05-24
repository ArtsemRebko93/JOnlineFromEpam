package by.jonline.mudele2.decomposition;

// Натуральное число, в записи которого n цифр,
// называется числом Армстронга, если сумма его цифр,
// возведенная в степень n, равна самому числу.
// Найти все числа Армстронга от 1 до k. Для решения задачи использовать декомпозицию.

public class Task14 {
    public static void show_Armstrong (int number) {
        for (int i = 1; i < number; i++) {
            if (Math.pow(summa_chisla(i),kol_Elementov(i)) == i) {
                pechat(i);
            }
        }
    }
    private static int summa_chisla (int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number = number / 10;
        }
        return sum;
    }
    private static int kol_Elementov (int number) {
        int counter = 0;
        while (number > 0) {
            number = number/10;
            counter++;
        }
        return counter;
    }
    private static void pechat (int number) {
        System.out.println(number);
    }
}
