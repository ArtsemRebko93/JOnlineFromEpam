package by.jonline.module1.cycles;

import java.util.Scanner;

//Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа.

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = scanner.nextInt();
        System.out.println("Enter m: ");
        int m = scanner.nextInt();
        Task7.cycle(n,m);
    }
    public static void showDelitel (int a) {
        for (int i = 2; i < a; i++) {
           if (a % i == 0 && a != i) {
               System.out.print(i + " ");
           }
        }
    }
    public static void cycle (int a, int b) {
        if (a > b) {
            for (int i = b; i <= a; i++) {
                if (i != 0) {
                    Task7.showDelitel(i);
                }
            }
        } else {
            for (int i = a; i <= b; i++) {
                if (i!= 0) {
                    Task7.showDelitel(i);
                }
            }
        }
    }
}
