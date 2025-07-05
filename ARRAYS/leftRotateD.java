package ARRAYS;
import java.util.*;
public class leftRotateD {
    public static void main(String[] args) {
        int d = 2;
        int[] arr = {1, 2, 3, 4, 5, 6};
        rotate(arr, d);
        System.out.println(Arrays.toString(arr));
    }
    public static void rotate(int[] arr, int d){
        int n = arr.length;
        d %= n;
        reverse(arr, 0, d- 1);
        reverse(arr, d, n -1);
        reverse(arr, 0, n - 1);
    }
    public static void reverse(int[] arr, int start, int end) {
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
