package by.jonline.mudele2.arrays_of_arrays;

//Сформировать квадратную матрицу порядка n по заданному образцу(n - четное).

public class Task4 {

    public static void main(String[] args) {
        int[][] array = new int[5][5];
        for (int row = 0; row < array.length; row++) {
            int neggativMarker = 1;
            int positivMarker = array[row].length;
            for (int column = 0; column < array[row].length; column++) {
                if (row % 2 == 0) {
                    array[row][column] = neggativMarker++;
                } else {
                    array[row][column] = positivMarker--;
                }
            }
        }
        for (int row = 0; row < array.length; row++) {
            for (int i = 0; i < array[row].length; i++) {
                System.out.print(array[row][i]);
            }
            System.out.println();
        }
    }
}
