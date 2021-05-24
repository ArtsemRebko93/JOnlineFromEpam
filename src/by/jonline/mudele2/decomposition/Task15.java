package by.jonline.mudele2.decomposition;

//Найти все натуральные n-значные числа,
// цифры в которых образуют строго возрастающую последовательность (например, 1234, 5789).
// Для решения задачи использовать декомпозицию.

public class Task15 {
    public static void show_chisla_vozrastniya (int razrad) {
        for (int i = (int) Math.pow(10,razrad - 1); i < Math.pow(10,razrad); i++) {
             if (sravnenie(i)) {
                 pechat(i);
             }
        }
    }

    private static boolean sravnenie (int number) {
        boolean show = true;
        int first = number % 10;
        int second = (number / 10) % 10;
        while (number != 0) {
            if (first <= second) {
                show = false;
                break;
            }
            number = number / 10;
            first = number % 10;
            second = (number / 10) % 10;
        }
        return show;
    }

    private static void pechat (int number) {
        System.out.println(number);
    }
}
