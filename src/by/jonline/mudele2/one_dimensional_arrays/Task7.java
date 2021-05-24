package by.jonline.mudele2.one_dimensional_arrays;

//Даны действительные числа a1 to an.
//Найти max (a1 + a2n, an + an+1)

public class Task7 {
    public static void main(String[] args) {
        double [] doubles = {5.5, 3.4, 7.8,2.1,10.2,3.3};
        double max = doubles[0] + doubles[1];
        for (int i = 0; i < doubles.length; i++) {
             if (i == doubles.length - 1) {
                break;
            }
            else if ((doubles[i] + doubles[i+1]) > max && i != doubles[doubles.length - 1]) {
                max = doubles[i] + doubles[i+1];
            }
        }
        System.out.println(max);
    }
}
