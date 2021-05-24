package by.jonline.module1.branching;

//Даны два угла треугольника (в градусах).
// Определить, существует ли такой треугольник, и если да, то будет ли он прямоугольным.

public class Task1 {
    public static void main(String[] args) {
        double x = 100;
        double y = 90;
        if ( x + y <= 180 ) {
            System.out.println("Тriangle ok");
            if (x == 90 || y == 90) {
                System.out.println("Triangle prymoygl");
            }
        } else {
            System.out.println("Triangle not found.");
        }
    }
}
