package by.jonline.module1.linear_program;

import java.util.Scanner;

// Найдите значение функции: z = ( (a – 3 ) * b / 2) + c.
public class Task1 {
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите последовательно a, b, c для вычисления выражения ( (a – 3 ) * b / 2) + c ");
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        int z = ((a - 3) * b / 2) + c;
        System.out.println("Your answer: " + z);
    }



}
