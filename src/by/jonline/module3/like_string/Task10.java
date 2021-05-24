package by.jonline.module3.like_string;

//Строка X состоит из нескольких предложений,
// каждое из которых кончается точкой, восклицательным или вопросительным знаком.
// Определить количество предложений в строке X.

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task10 {

    private static int countSentences (String str) {
        int counter = 0;
        Pattern pattern = Pattern.compile("[.?!]");
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            counter++;
        }
        return counter;
    }

    public static void main(String[] args) {
        String str = "Строка X состоит из нескольких предложений," +
                " каждое из которых кончается точкой, восклицательным или вопросительным знаком." +
                " Определить количество предложений в строке X.";
        System.out.println(Task10.countSentences(str));
    }
}
