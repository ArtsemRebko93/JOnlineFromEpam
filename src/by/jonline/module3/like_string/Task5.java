package by.jonline.module3.like_string;

// Подсчитать, сколько раз среди символов заданной строки встречается буква “а”.

public class Task5 {
    private static int count_a (String str) {
        int counter = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'а') {
                counter++;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        String stroka = "Мама мыла раму, рама мыла маму.";
        System.out.println(Task5.count_a(stroka));
    }
}
