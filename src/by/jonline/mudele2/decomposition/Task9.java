package by.jonline.mudele2.decomposition;

//Даны числа X, Y, Z, Т — длины сторон четырехугольника.
// Написать метод(методы) вычисления его площади, если угол между сторонами длиной X и Y— прямой.

public class Task9 {

    public static double square_Fourtangle (double x, double y, double z, double t) {
        return (square_Pryamoy_Triange(x,y) + square_Triangle(x,y,z,t));
    }
    public static double square_Triangle (double x, double y, double z, double t) {
        return Math.sqrt(perimetr_Triangle(x,y,z,t) * (perimetr_Triangle(x,y,z,t) - z) *
                (perimetr_Triangle(x,y,z,t) - t) * (perimetr_Triangle(x,y,z,t)
                - Math.sqrt(Math.pow(x,2) + Math.pow(y,2))));
    }
    private static double perimetr_Triangle (double x, double y, double z, double t) {
        return (z+t + Math.sqrt(Math.pow(x,2) + Math.pow(y,2))) / 2;
    }
    private static double square_Pryamoy_Triange (double x, double y) {
        return (x * y) / 2;
    }
 }
