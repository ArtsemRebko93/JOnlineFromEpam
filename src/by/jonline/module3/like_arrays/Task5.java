package by.jonline.module3.like_arrays;

//Удалить в строке все лишние пробелы, то есть серии подряд идущих пробелов заменить на одиночные пробелы.
// Крайние пробелы в строке удалить.

public class Task5 {
    public static void main(String[] args) {
        String s = "   Oh  my  God..so hard    ";
        String [] strings = s.split(" +");
        StringBuilder newS = new StringBuilder();
        for (int i = 0; i < strings.length; i++) {
            if (i == 0 || i == strings.length - 1) {
                newS.append(strings[i]);
                continue;
            }
            newS.append(strings[i] + " ");
        }
        System.out.println(newS);
    }
}
