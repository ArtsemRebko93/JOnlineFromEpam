package by.jonline.module3.like_string;

//Вводится строка слов, разделенных пробелами. Найти самое длинное слово и вывести его на экран.
// Случай, когда самых длинных слов может быть несколько, не обрабатывать.
public class Task8 {

    private static String mostLongWord (String str) {

        String [] strings = str.split(" ");
        int maxLength = strings[0].length();
        String longWord = "";
        for (int i = 0; i < strings.length; i++) {
            if (strings[i].length() > maxLength) {
                maxLength = strings[i].length();
                longWord = strings[i];
            }
        }
        return longWord;
    }

    public static void main(String[] args) {
        String str = "Мне кажется, но слово Эйяфьядлайокудль достаточно длинное, чтобы выбрать его.";
        System.out.println(Task8.mostLongWord(str));
    }
}
