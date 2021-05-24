package by.jonline.module1.cycles;

import java.util.Scanner;

//Напишите программу, где пользователь вводит любое целое положительное число.
// А программа суммирует все числа от 1 до введенного пользователем числа.

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int x = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i < x; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
