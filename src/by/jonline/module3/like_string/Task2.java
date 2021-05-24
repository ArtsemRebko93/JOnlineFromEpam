package by.jonline.module3.like_string;

// В строке вставить после каждого символа 'a' символ 'b'.

public class Task2 {
    private static String a_On_b (String stroka) {
        StringBuilder stringBuilder = new StringBuilder();
        String str;
        char marker = 'b';
        for (int i = 0; i < stroka.length(); i++) {
            if (stroka.charAt(i) == 'a') {
                stringBuilder.append(stroka.charAt(i));
                stringBuilder.append(marker);
            } else {
                stringBuilder.append(stroka.charAt(i));
            }
        }
        str = stringBuilder.toString();
        return str;
    }

    public static void main(String[] args) {
        String string = " It's test task for me and my Application.";
        System.out.println(Task2.a_On_b(string));
    }
}
