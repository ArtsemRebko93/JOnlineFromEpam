package by.jonline.module1.linear_program;

import java.util.Scanner;

//Для данной области составить линейную программу, которая печатает true,
// если точка с координатами (х, у) принадлежит закрашенной области, и false — в противном случае.

public class Task6 {
    public static void main(String[] args) {
        System.out.println("Enter x and y");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        if ( (y <= 4 & y >= -3) && ( x >= -2 && x <= 2) ||
                ((( x >= -4 & x <= -2 ) || ( x >= 2 & x <= 4)) && ( y >= -3 & y <= 0))) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
