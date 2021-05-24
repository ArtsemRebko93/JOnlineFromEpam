package by.jonline.mudele2.decomposition;

import java.util.Arrays;

public class Task5 {
   public static int second_in_massive (int [] massive) {
       Arrays.sort(massive);
       return massive[massive.length-2];
   }
   public static int second (int [] massive) {
       int max = massive[0];
       int index = 0;
       for (int i = 1; i < massive.length; i++) {
           if (massive[i] > max) {
               max = massive[i];
               index = i;
           }
       }
       massive[index] = 0;
       max = massive[0];
       for (int i = 0; i < massive.length; i++) {
           if (massive[i] > max) {
               max = massive[i];
           }
       }
       return max;
   }
}

