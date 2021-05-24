package by.jonline.module1.branching;

import java.util.Scanner;

//вычислить значение функции
// x^2 - 3 * x + 9, if  x <= 3
// 1 / (x^3 + 6), if x > 3

public class Task5 {
    public static void main(String[] args) {
        System.out.println("enter x: ");
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        if (x > 3) {
            System.out.println(1 / (x * x * x + 6));
        } else {
            System.out.println(x * x - 3 * x + 9);
        }
    }
}
