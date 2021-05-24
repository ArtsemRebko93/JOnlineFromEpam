package by.jonline.module3.like_string;

//Вводится строка. Требуется удалить из нее повторяющиеся символы и все пробелы.
// Например, если было введено "abc cde def", то должно быть выведено "abcdef".

public class Task7 {
    private static String removeRepeats (String str) {
        StringBuilder builder = new StringBuilder(str);
        char ch = ' ';
        for (int i = 0; i < builder.length(); i++) {
            if (builder.charAt(i) == ch) {
                builder.deleteCharAt(i);
            }
        }
        for (int i = 0; i < builder.length(); i++) {
            for (int j = 0; j < builder.length(); j++) {
                if (builder.charAt(i) == builder.charAt(j) && i != j) {
                    builder.deleteCharAt(j);
                }
            }
        }
        return builder.toString();
    }
    public static void main(String[] args) {
        String s = "abcc cddfde def";
        System.out.println(Task7.removeRepeats(s));
    }
}
