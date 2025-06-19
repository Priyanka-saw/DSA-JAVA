package ARRAYS;

import java.util.Arrays;

public class Sorted {
    
    public static void main(String[] args) {
        int[] arr = {1, 2, 3 ,4 ,5};
        System.out.println(sortedArr(arr));
        System.out.println(Arrays.toString(arr));

    }
    public static boolean  sortedArr(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] >= arr[i-1]){
                
            } else {
                return false;
            }
        }
        return true;
    }
}
