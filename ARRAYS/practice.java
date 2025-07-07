package ARRAYS;

import java.util.Arrays;

public class practice {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 5, 5, 6, 6 };
        System.out.println("value : " + Checkfun(arr));
        System.out.println(Arrays.toString(arr));

    }

    public static int Checkfun(int[] arr) {

        // sorted checking

        // for (int i = 1; i < arr.length; i++) {
        // if(arr[i] >= arr[i -1]){

        // } else {
        // return false;
        // }
        // }
        // return true;

        // seclargest value

        // int max = -1, secmax = -1;
        // for (int i = 0; i < arr.length; i++) {
        // if(arr[i] > max) {
        // max = arr[i];
        // }
        // }
        // for (int i = 0; i < arr.length; i++) {
        // if(arr[i] > secmax && arr[i] != max){
        // secmax = arr[i];
        // }
        // }
        // return secmax;

        // left rotate one places

        // int n = arr.length;
        // int temp = arr[0];
        // for (int i = 1; i < n; i++) {
        //     arr[i - 1] = arr[i];
        // }
        // return arr[n - 1] = temp;

        // remove duplicate
        int i = 0;
        for(int j = 1; j < arr.length; j++){
            if(arr[j] != arr[i]){
                arr[i+ 1] = arr[j];
                i++;
            }
        }
        return (i + 1);

        // left rotate d place
        
    }
}
