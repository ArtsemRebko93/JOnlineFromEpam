package by.jonline.mudele2.decomposition;

//Два простых числа называются «близнецами»,
// если они отличаются друг от друга на 2 (например, 41 и 43).
// Найти и напечатать все пары «близнецов» из отрезка [n,2n],
// где n - заданное натуральное число больше 2. Для решения задачи использовать декомпозицию.

public class Task13 {
    public static void bliznec (int n) {
        for (int i = n; i < n * 2; i = i + 2) {
            if ((n * 2 - i) == 1 || (n * 2 - i) == 0) {
                break;
            }
            pechat(i);
            System.out.println();

        }
    }
    private static void pechat (int i) {
        System.out.print(i + " " + (i + 2));
    }
}
