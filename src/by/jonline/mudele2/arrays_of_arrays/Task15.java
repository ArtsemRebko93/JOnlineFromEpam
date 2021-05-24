package by.jonline.mudele2.arrays_of_arrays;

//Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.

public class Task15 {
    public static void main(String[] args) {
        int [][] matrix = new int[7][7];
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = (int) (Math.random() * 10);
            }
        }
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                System.out.print(matrix[row][column] + " ");
            }
            System.out.println();
        }
        int max = matrix[0][0];
        for (int [] number: matrix) {
            for (int chislo: number) {
                if (max < chislo) {
                    max = chislo;
                }
            }
        }
        System.out.println(max);
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                if ((row % 2 == 0 && column % 2 == 0 ) || (row % 2 != 0 && column % 2 != 0 && row != 0)) {
                    matrix[row][column] = max;
                }
            }
        }
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                System.out.print(matrix[row][column] + " ");
            }
            System.out.println();
        }
    }
}
