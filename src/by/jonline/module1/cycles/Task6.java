package by.jonline.module1.cycles;

import java.util.Scanner;

//Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера.
public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        char [] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            System.out.print((int) chars[i] + " ");
        }
    }
}