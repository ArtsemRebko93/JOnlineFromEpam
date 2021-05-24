package by.jonline.module1.linear_program;

import java.util.Scanner;

//Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях).
// Поменять местами дробную и целую части числа и вывести полученное значение числа.

public class Task4 {
    public static void main(String[] args) {
        System.out.println("Enter double number, like nnn.ddd ");
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double y = (x * 1000) % 1000 + (int) x / 1000.0;
        System.out.println(y);
    }
}
