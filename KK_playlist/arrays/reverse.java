package KK_playlist.arrays;
import java.util.Arrays;

public class reverse {
    public static void main(String[] args) {
        
        int[] arr = {1, 3, 4, 5, 6};
        reverseArr(arr);
        System.out.println(Arrays.toString(arr));
    }

    // two pointer methods i,e start and end
    static void reverseArr(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while(start < end){
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    static void swap(int[] arr, int start, int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

    }
}
