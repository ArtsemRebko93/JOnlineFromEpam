package by.jonline.module3.like_string;

// Из заданной строки получить новую, повторив каждый символ дважды.

public class Task6 {

    private static String newString (String str, int marker) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < marker; j++) {
                stringBuilder.append(str.charAt(i));
            }
        }
        return stringBuilder.toString();

    }

    public static void main(String[] args) {
        String s = "Mama ama kriminall";
        System.out.println(Task6.newString(s,2));
    }
}
