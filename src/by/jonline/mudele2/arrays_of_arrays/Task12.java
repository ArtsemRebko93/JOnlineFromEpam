package by.jonline.mudele2.arrays_of_arrays;

//Отсортировать строки матрицы по возрастанию и убыванию значений элементов.

public class Task12 {
    public static void main(String[] args) {
        int[][] ints = new int[7][7];
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
        int swap = 0;
        for (int row = 0; row < ints.length; row++) {
            boolean sorted = false;
            while (!sorted) {
                sorted = true;
                for (int column = 0; column < ints[row].length - 1; column++) {
                    if (ints[row][column] > ints[row][column + 1]) {
                        sorted = false;
                        swap = ints[row][column];
                        ints[row][column] = ints[row][column + 1];
                        ints[row][column + 1] = swap;
                    }
                }
            }
        }

        System.out.println();
        for (int row = 0; row < ints.length; row++) {
            for (int column = 0; column < ints[row].length; column++) {
                System.out.print(ints[row][column] + " ");
            }
            System.out.println();
        }
        System.out.println();
        swap = 0;
        for (int row = 0; row < ints.length; row++) {
            boolean sorted = false;
            while (!sorted) {
                sorted = true;
                for (int column = 0; column < ints[row].length - 1; column++) {
                    if (ints[row][column] < ints[row][column + 1]) {
                        sorted = false;
                        swap = ints[row][column];
                        ints[row][column] = ints[row][column + 1];
                        ints[row][column + 1] = swap;
                    }
                }
            }
        }
        for (int row = 0; row < ints.length; row++) {
            for (int column = 0; column < ints[row].length; column++) {
                System.out.print(ints[row][column] + " ");
            }
            System.out.println();
        }
    }
}
