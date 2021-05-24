package by.jonline.mudele2.decomposition;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("NOD: " + Task1.Nod(15, 125));
        System.out.println("NOK: " + Task1.Nok(15, 125));
        System.out.println("Nod 4 number's: " + Task2.Nod_four(4, 16, 8, 12));
        System.out.println("Square: " + Task3.square(4));
        int[] ints = {8, 5, 1, 23, 21};
        int[] tochka1 = {1, 2};
        int[] tochka2 = {1, 6};
        int[] tochka3 = {2, 7};
        int[] tochka4 = {3, 7};
        int[][] massive = {{1, 2}, {1, 5}, {6, 7}, {3, 9}};
        System.out.println(Arrays.toString(Task4.show_tochky(massive)));
        System.out.println(Task5.second_in_massive(ints));
        System.out.println(Task5.second(ints));
        System.out.println(Task6.Vsaimnoprostoe_three(2, 11, 24));
        System.out.println(Task7.factorial(9));
        System.out.println(Task8.sum_three_elem(ints, 1, 3));
        System.out.println(Task9.square_Fourtangle(3.0, 4.0, 5.0, 5.0));
        System.out.println(Arrays.toString(Task10.massive_from_chislo(1234)));
        System.out.println(Task11.chto_bolshe(12453, 123456));
        System.out.println(Arrays.toString(Task12.specific_massive(6, 125, 5)));
        Task13.bliznec(19);
        Task14.show_Armstrong(100000);
        Task15.show_chisla_vozrastniya(3);
        Task16.show_summa_and_chisel_chetnuh(2);
        System.out.println(Task17.show_kol_vo_operation(124));
    }
}
