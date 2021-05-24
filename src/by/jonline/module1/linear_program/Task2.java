package by.jonline.module1.linear_program;

import java.util.Scanner;

// (b + корень из (b * b + 4ac))/2a - a * a * a * c + b(в степени -2)

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a , b , c : ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double temp = b + Math.sqrt(Math.pow(b,2.0) + 4 * a * c); // 6
        temp = temp / 2 * a - Math.pow(a,3) * c;
        temp = temp + Math.pow(b, -2);
        System.out.println("Result: " + temp);
    }
}
