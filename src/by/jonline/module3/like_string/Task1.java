package by.jonline.module3.like_string;

//Дан текст (строка). Найдите наибольшее количество подряд идущих пробелов в нем.

public class Task1 {

    private static int mostSpaces (String stroka) {
        char [] chars = stroka.toCharArray();
        int couter = 0;
        int maxCount = 0;
        char marker = ' ';
        for (char bykva: chars) {
            if (bykva == marker) {
                couter++;
            } else {
                couter = 0;
            }
            if (couter > maxCount) {
                maxCount = couter;
            }
        }
        return maxCount;
    }

    public static void main(String[] args) {
        String str = "   Н у вот тут будет                много пробелов, где-то 16";
        System.out.println(Task1.mostSpaces(str));
    }
}
