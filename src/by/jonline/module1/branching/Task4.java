package by.jonline.module1.branching;

//Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича.
// Определить, пройдет ли кирпич через отверстие.

public class Task4 {
    public static void main(String[] args) {
        int a = 20;
        int b = 10;
        int x = 19;
        int y = 20;
        int z = 10;
        Task4.yesOrNotKirpich(a,b,x,y,z);
    }
    public static void yesOrNotKirpich (int a, int b, int x, int y,int z) {
        if (Task4.square(a, b) > Task4.square(x,y) || Task4.square(a, b) > Task4.square(x, z)
                || Task4.square(a, b) > Task4.square(y, z) ) {
            System.out.println("Пройдет как миленький.");
        } else {
            System.out.println("Ты куда его пихаешь,а? Подумай хорошенько.");
        }
    }
    public static int square (int a, int b) {
        return a * b;
    }
}
