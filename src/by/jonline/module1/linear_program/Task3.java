package by.jonline.module1.linear_program;

import java.util.Scanner;

//Вычислить значение выражения по формуле
// (все переменные принимают действительные значения): (𝑠𝑖𝑛𝑥+𝑐𝑜𝑠𝑦)/(𝑐𝑜𝑠𝑥−𝑠𝑖𝑛𝑦)∗𝑡𝑔 𝑥𝑦

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter x and y: ");
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        double temp = (Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y));
        temp = temp * Math.tan(x * y);
        System.out.println("Result: " + temp);
    }
}
