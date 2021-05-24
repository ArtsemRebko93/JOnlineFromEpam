package by.jonline.mudele2.arrays_of_arrays;

//Сформировать случайную матрицу m x n, состоящую из нулей и единиц, причем в каждом столбце число
//единиц равно номеру столбца.
public class Task14 {
    public static void main(String[] args) {
        int row = 5;
        int column = 7;
        int [][] matrix = new int[row][column];
        int counter = 0;
        for (column = 0; column < 6; column++) {
            counter = 0;
            row = 0;
                while (counter < column && column != 0) {
                    matrix[row][column] = 1;
                    counter++;
                    row++;
                }
            }
        for (row = 0; row < matrix.length; row++) {
            for (column = 0; column < matrix[row].length; column++) {
                System.out.print(matrix[row][column] + " ");
            }
            System.out.println();
        }
    }
}
