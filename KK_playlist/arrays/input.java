package KK_playlist.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int[] arr = new int[5];

        // arr[0] = 23;
        // arr[1] = 12;
        // arr[2] = 52;
        // arr[3] = 32;
        // arr[4] = 42;

        // System.out.println(arr[3]);

        // using for loop
        // for (int i = 0; i < arr.length; i++) {
        //     arr[i] = sc.nextInt();
        // }

        // for (int j = 0; j < arr.length; j++) {
            // System.out.print(arr[j] + " ");
        // }


        // using for each loop
        // for(int num : arr){
            // System.out.println(num + " ");
        // }


        // best one to print arrays

        // System.out.println(Arrays.toString(arr));



        // arrays of objects
        String[] str = new String[5];
        for (int i = 0; i < str.length; i++) {
            str[i] = sc.next();
        }
        System.out.println(Arrays.toString(str));

        // modify
        str[1] = "Priyanka";
        System.out.println(Arrays.toString(str));
    }
    
}
