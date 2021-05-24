package by.jonline.mudele2.arrays_of_arrays;

//Отсотрировать стобцы матрицы по возрастанию и убыванию значений эементов.

public class Task13 {
    public static void main(String[] args) {
        int row = 7;
        int column = 7;
        int [][] matrix = new int[row][column];
        for (row = 0; row < matrix.length; row++) {
            for (column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = (int) (Math.random() * 10);
            }
        }
        for (row = 0; row < matrix.length; row++) {
            for (column = 0; column < matrix[row].length; column++) {
                System.out.print(matrix[row][column] + " ");
            }
            System.out.println();
        }
        int swap = 0;
        for (column = 0; column < matrix.length; column++) {
            boolean sorted = false;
            while (!sorted) {
                sorted = true;
                for (row = 0; row < matrix.length - 1; row++) {
                    if (matrix[row][column] > matrix[row+1][column]) {
                        sorted = false;
                        swap = matrix[row][column];
                        matrix[row][column] = matrix[row+1][column];
                        matrix[row+1][column] = swap;
                    }
                }
            }
        }
        System.out.println();
        for (row = 0; row < matrix.length; row++) {
            for (column = 0; column < matrix[row].length; column++) {
                System.out.print(matrix[row][column] + " ");
            }
            System.out.println();
        }
        System.out.println();

        for (column = 0; column < matrix.length; column++) {
            boolean sorted = false;
            while (!sorted) {
                sorted = true;
                for (row = 0; row < matrix.length - 1; row++) {
                    if (matrix[row][column] < matrix[row+1][column]) {
                        sorted = false;
                        swap = matrix[row][column];
                        matrix[row][column] = matrix[row+1][column];
                        matrix[row+1][column] = swap;
                    }
                }
            }
        } for (row = 0; row < matrix.length; row++) {
            for (column = 0; column < matrix[row].length; column++) {
                System.out.print(matrix[row][column] + " ");
            }
            System.out.println();
        }

    }
}
