package by.jonline.mudele2.sorting;

/*
Даны дроби.
Составить программу, которая приводит эти дроби к общему
знаменателю и упорядочивает их в порядке возрастания.
 */
public class Task8 {

    public static void main(String[] args) {
        Fraction [] fractions = {new Fraction(1,3), new Fraction(3,5),
                                        new Fraction(3,9),new Fraction(4,10)};
        commonDenominator(fractions);
        arraySorted(fractions);
        printFractionArray(fractions);
    }

    private static void commonDenominator(Fraction[] array) {
        boolean isCommon = false;
        int commonDenominator = 0;
        while (!isCommon) {
            isCommon = true;
            commonDenominator++;
            for (Fraction element : array) {
                if (commonDenominator % element.denominator != 0) {
                    isCommon = false;
                }
            }
        }
        for (Fraction element: array) {
            element.numerator *= commonDenominator / element.denominator;
            element.denominator = commonDenominator;
        }
    }

    private static void arraySorted (Fraction [] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i].numerator < array[j].numerator) {
                    Fraction temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    private static void printFractionArray (Fraction [] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i].toString());
        }
    }
    static class Fraction {
        int numerator;
        int denominator;

        public Fraction(int numerator, int denominator) {
            this.numerator = numerator;
            this.denominator = denominator;
        }

        public String toString () {
            return String.format("%d/%d",numerator,denominator);
        }

    }
}
