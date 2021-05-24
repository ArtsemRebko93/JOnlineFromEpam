package by.jonline.mudele2.arrays_of_arrays;

//Найти положительные элементы главной диагонали квадратной матрицы.

public class Task10 {
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
        int counter = 0;
        for (int row = 0; row < ints.length; row++) {
            for (int column = 0; column < ints[row].length; column++) {
                if (row == column && ints[row][column] > 0) {
                    counter++;
                }
            }
        }
        int c = ints.length - 1;
        for (int row = 0; row < ints.length; row++) {
            if (ints[row][c--] > 0) {
                counter++;
            }
        }
        System.out.println("Кол-во положительных элментов главной диагонали:" + (counter - 1));
    }
}
