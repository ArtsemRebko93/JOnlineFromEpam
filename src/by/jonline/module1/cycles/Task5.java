package by.jonline.module1.cycles;

import java.util.Arrays;
import java.util.Scanner;

//дан числовой ряд и некоторое число е
//найти сумму тех членов ряда, модуль которы больше или равен заданному е
//общий член ряда имеет вид an = 1/2^n + 1/3^n (где n - порядковый номер)

public class Task5 {
    public static void main(String[] args) {
        double [] array = new double[10];
        for (double i = 0; i < array.length; i++) {
            array[(int) i] = 1/Math.pow(2,i) + 1/Math.pow(3,i);
        }
        System.out.println(Arrays.toString(array));
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter e: ");
        double e = scanner.nextDouble();
        double sum = 0;
        for (double  number: array) {
            if (Math.abs(number) >= e) {
                sum += number;
            }
        }
        System.out.println(sum);
    }
}
