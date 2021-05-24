package by.jonline.module3.like_arrays;

//В строке найти количество цифр.

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String s = scanner.nextLine();
        Pattern pattern = Pattern.compile("-?[0-9]");
        Matcher matcher = pattern.matcher(s);
        int counter = 0;
        while (matcher.find()) {
            counter++;
        }
        System.out.println(counter);
    }

}
