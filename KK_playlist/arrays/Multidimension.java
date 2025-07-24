package KK_playlist.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Multidimension {
    public static void main(String[] args) {

        /*
         * 1 2 3
         * 4 5 6
         * 7 8 9
         */
        // the number of rows is mendatory not cols

        Scanner sc = new Scanner(System.in);

        // int[][] arr1 = {
        // { 1, 2, 3 },
        // { 4, 5, 6 },
        // { 7, 8, 9 }
        // };
        // System.out.println(Arrays.toString(arr[0]));

        int[][] arr = new int[3][3];

        // input
        // row
        for (int i = 0; i < arr.length; i++) {

            // cols
            for (int j = 0; j < arr[i].length; j++) {

                arr[i][j] = sc.nextInt();
            }
        }

        // output
        // for (int i = 0; i < arr.length; i++) {
        //     for (int j = 0; j < arr[i].length; j++) {
        //         System.out.print(arr[i][j] + " ");
        //     }
        //     System.out.println();
        // }

        // for (int i = 0; i < arr.length; i++) {
        //     System.out.println(Arrays.toString(arr[i]));
        // }


        // enhenced for loop
        for (int[] i : arr) {
            System.out.println(Arrays.toString(i));
        }
    }
}
