package by.jonline.mudele2.arrays_of_arrays;

//Магическим квадратом порядка n называется квадратная матрица размера nxn, составленная из чисел 1, 2, 3,
//..., 2 n так, что суммы по каждому столбцу, каждой строке и каждой из двух больших диагоналей равны между
//собой. Построить такой квадрат.

public class Task16 {
    public static void main(String[] args) {
        int [][] matrix = new int[3][3];
        matrix[0] = new int [] {1, 7, 9};
        int sum = 0;
        for (int i = 0; i < matrix[0].length; i++) {
            sum += matrix[0][i];
        }
        System.out.println(sum);
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                System.out.print(matrix[row][column] + " ");
            }
            System.out.println();
        }

    }
}
