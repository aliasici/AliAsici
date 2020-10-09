package Replit;

import java.util.Arrays;

public class Replit_205 {
    public static void main(String[] args) {

        int[] ints1 = {1, 2, 3, 4, 5};
        int[] ints2 ={6, 7, 8, 9, 10};
        int[] a3 = addElements(ints1,ints2);

        System.out.println(Arrays.toString(a3));



    }

    public static int[] addElements(int[] ints1, int[] ints2) {


        int[] arr = new int[ints1.length];


        for(int i = 0; i < ints1.length; i++) {
            arr[i] = ints1[i] + ints2[i];

        }
        return arr;



    }
}
