package by.jonline.module3.like_string;

//С помощью функции копирования и операции конкатенации составить из частей слова “информатика” слово “торт”.
public class Task4 {
    private static String makeWordTort (String informatica) {
        char [] marker = {'о', 'р'};
        String str = String.valueOf(informatica.charAt(informatica.indexOf('т')));
        str += String.copyValueOf(marker);
        str += String.valueOf(informatica.charAt(informatica.indexOf('т')));
        return str;
    }

    public static void main(String[] args) {
        String informatica = "информатика";
        System.out.println(Task4.makeWordTort(informatica));
    }
}
