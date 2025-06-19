package ARRAYS;

import java.util.Arrays;

public class leftRotateOne {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(leftRotate(arr));
       System.out.println(Arrays.toString(arr));
    }
    public static int  leftRotate(int[] arr){
        int n = arr.length;
        int temp = arr[0];  // for compare with arr[i]
        for (int i = 1; i < n; i++) {
            arr[i - 1] = arr[i];
            }       
          return arr[n - 1] = temp;     
        }
    }

