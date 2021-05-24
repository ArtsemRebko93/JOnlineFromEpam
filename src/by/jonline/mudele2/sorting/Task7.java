package by.jonline.mudele2.sorting;


//Пусть даны две неубывающие последовательности действительных чисел a1 <= an and b1<=bm .
//Требуется указать те места, на которые нужно вставлять элементы последовательности b1<=bm в первую
//последовательность так, чтобы новая последовательность оставалась возрастающей.

public class Task7 {
    public static void main(String[] args) {
        int [] array1 = {1,2,4,8,10};
        int [] array2 = {3,5,7};
        int [] newArray = array1;

        System.out.println("Первый массив: ");
        printArray(array1);
        System.out.println("\nВторой массив: ");
        printArray(array2);

        for (int element: array2) {
            int elementIndexInsert = indexInsertPorition(newArray,element);
            int [] arrayTemp = new int[newArray.length + 1];
            for (int i = 0; i < newArray.length; i++) {
                if (elementIndexInsert > i) {
                    arrayTemp[i] = newArray[i];
                } else if (elementIndexInsert == i) {
                    arrayTemp[i] = element;
                    arrayTemp[i + 1] = newArray[i];
                } else {
                    arrayTemp[i+1] = newArray[i];
                }
            }
            newArray = arrayTemp;
            System.out.printf("\nПозиция вставки нового элемента %d : %d\n",element,elementIndexInsert);
            printArray(newArray);
            System.out.println();
        }
    }


    private static int indexInsertPorition(int [] array, int element) {
        int index = 0;
        int firstIndex = 0;
        int lastIndex = array.length - 1;

        while (firstIndex <= lastIndex) {
            index = (lastIndex - firstIndex) / 2;
            if (array[index] == element) {
                return index;
            } else if (array[index] < element) {
                firstIndex = index + 1;
            }
            else if (array[index] > element && index != 0 && !(array[index-1] < element)) {
                lastIndex = index - 1;
            } else {
                break;
            }
        }
        return index;
    }

    private static void printArray (int [] array) {
        for (int element: array) {
            System.out.print(element + " ");
        }
    }
}
