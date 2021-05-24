package by.jonline.mudele2.decomposition;

//Из заданного числа вычли сумму его цифр.
// Из результата вновь вычли сумму его цифр и т.д.
// Сколько таких действий надо произвести, чтобы получился нуль?
// Для решения задачи использовать декомпозицию.

public class Task17 {

    public static int show_kol_vo_operation (int number) {
        int counter = 0;
        int new_number = number;
        while (new_number > 0) {
            new_number = new_number - summa(number);
            counter++;
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
}
