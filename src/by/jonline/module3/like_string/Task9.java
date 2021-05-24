package by.jonline.module3.like_string;

//Посчитать количество строчных (маленьких) и прописных (больших) букв в введенной строке.
// Учитывать только английские буквы.

public class Task9 {

    private static int countLowerCase (String str) {
        int counter = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                counter++;
            }
        }
        return counter;
    }

    private static int countUpperCase (String str) {
        int counter = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                counter++;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        String s = "Test";
        System.out.println(Task9.countLowerCase(s));
    }
}