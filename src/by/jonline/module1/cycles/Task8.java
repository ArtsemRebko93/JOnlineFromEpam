package by.jonline.module1.cycles;

import java.util.Scanner;

//Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first and second number: ");
        System.out.println("Enter second and second number: ");
        String s = scanner.nextLine();
        String s1 = scanner.nextLine();
        char [] chars = s.toCharArray();
        char [] chars1 = s1.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j < chars1.length; j++) {
                if (chars[i] == chars1[j]) {
                    System.out.println(chars[i]);
                }
            }
        }
    }
}
