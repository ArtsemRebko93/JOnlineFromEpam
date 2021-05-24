package by.jonline.module1.linear_program;

//Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах.
// Вывести данное значение длительности в часах, минутах и секундах в следующей форме:
// ННч ММмин SSc.
public class Task5 {
    public static void main(String[] args) {
        int time = 7367;
        int h = time / 3600;
        int m = (time - h * 3600) / 60;
        int s = time - h * 3600 - m * 60;
        System.out.printf("%02dч %02dмин %02dс", h, m, s);
    }
}
