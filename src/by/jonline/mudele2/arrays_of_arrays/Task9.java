package by.jonline.mudele2.arrays_of_arrays;

//Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце. Определить, какой
//столбец содержит максимальную сумму.

public class Task9 {
    public static void main(String[] args) {
        int row = 5;
        int column = 5;
        int[][] ints = new int[row][column];
        for (row = 0; row < ints.length; row++) {
            for (column = 0; column < ints[row].length; column++) {
                ints[row][column] = (int) (Math.random() * 10);
            }
        }
        for (row = 0; row < ints.length; row++) {
            for (column = 0; column < ints[row].length; column++) {
                System.out.print(ints[row][column] + " ");
            }
            System.out.println();
        }
        int maxSum = 0;
        int indexColumn = 0;
        for (column = 0; column < ints[row-1].length; column++) {
            int sum = 0;
            for (row = 0; row < ints.length; row++) {
                sum += ints[row][column];
            }
            if (sum > maxSum) {
                maxSum = sum;
                indexColumn = column;
            }
            System.out.println(sum);
        }
        System.out.printf("\n%d - индекс столбца, %d - сумма",indexColumn,maxSum);
    }
}
