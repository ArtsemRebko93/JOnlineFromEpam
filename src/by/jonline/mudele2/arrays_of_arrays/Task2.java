package by.jonline.mudele2.arrays_of_arrays;

//Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.

public class Task2 {
    public static void main(String[] args) {
        int[][] ints = new int[5][5];
        for (int row = 0; row < ints.length; row++) {
            for (int column = 0; column < ints[row].length; column++) {
                ints[row][column] = (int) (Math.random() * 10);
            }
        }
        for (int row = 0; row < ints.length; row++) {
            for (int column = 0; column < ints[row].length; column++) {
                System.out.print(ints[row][column] + " ");
            }
            System.out.println();
        }
        System.out.println();
        for (int row = 0; row < ints.length; row++) {
            for (int column = 0; column < ints[row].length; column++) {
                if (row == column) {
                    System.out.print(ints[row][column] + " ");
                }
            }
        }
        System.out.println();
        int c = 4;
        for (int row = 0; row < ints.length; row++) {
            System.out.print(ints[row][c--] + " ");
        }
    }
}
