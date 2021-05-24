package by.jonline.module1.branching;

//Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой.

public class Task3 {
    public static void main(String[] args) {
        int x1 = 1;
        int y1 = 2;
        int x2 = 2;
        int y2 = 4;
        int x3 = 3;
        int y3 = 6;
        System.out.println(trueOrFalse(x1,y1,x2,y2,x3,y3));
    }
    //используем уравнение прямой
    public static boolean trueOrFalse (int x1, int y1, int x2, int y2, int x3, int y3) {
        if ((x3 - x1) / (x2 - x1) == (y3 - y1) / (y2 - y1)) {
            return true;
        } else {
            return false;
        }
    }
}
