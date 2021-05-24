package by.jonline.module1.cycles;

import java.math.BigInteger;

//Составить программу нахождения произведения квадратов первых двухсот чисел.

public class Task4 {
    public static void main(String[] args) {
        BigInteger proizv = BigInteger.valueOf(1);
        for (int i = 1; i <= 200; i++) {
            proizv = proizv.multiply(BigInteger.valueOf((long) i * i));
        }
        System.out.println(proizv);
    }
}
