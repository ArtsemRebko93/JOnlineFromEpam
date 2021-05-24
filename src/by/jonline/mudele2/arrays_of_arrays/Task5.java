package by.jonline.mudele2.arrays_of_arrays;

//Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):

public class Task5 {
    public static void main(String[] args) {
        int [][] ints = new int[5][5];
        for (int row = 0; row < ints.length; row++) {
            for (int column = 0; column < ints[row].length-row; column++) {
                ints[row][column] = row + 1;
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
