package by.jonline.module3.like_arrays;

//Замените в строке все вхождения 'word' на 'letter'.

import java.util.Scanner;

public class Task2 {

    private static String  wordOnLetter (String words) {
        StringBuilder stringBuilder = new StringBuilder();
        String symbols;
        for (int i = 0; i < words.length(); i++) {
            if (i + 3 < words.length() && words.charAt(i) == 'w'
                    && words.charAt(i+1) == 'o'
                        && words.charAt(i+2) == 'r'
                            && words.charAt(i+3) == 'd') {
                stringBuilder.append("letter");
                i+=3;
            } else {
                stringBuilder.append(words.charAt(i));
            }
        }
        symbols = stringBuilder.toString();
        return symbols;
    }

    public static void main(String[] args) {
        String str = "Thw world is mine!";
        System.out.println(Task2.wordOnLetter(str));
    }
}
