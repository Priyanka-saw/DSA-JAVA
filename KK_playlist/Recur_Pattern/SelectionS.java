package KK_playlist.Recur_Pattern;

import java.util.Arrays;

public class SelectionS {
    public static void main(String[] args) {

        int[] arr = { 5, 6, 3, 2, 8 };
        SelectionSort(arr, arr.length, 0, 0);
        System.out.println(Arrays.toString(arr));

    }

    static void SelectionSort(int[] arr, int r, int c, int max) {
        // base conditions
        if (r == 0) {
            return;
        }
        
        if (c < r) {
            if (arr[c] > arr[max]) {
                SelectionSort(arr, r, c + 1, c);
            } else {
                SelectionSort(arr, r, c + 1, max);
            }
        } else {
            // swap
            int temp = arr[max];
            arr[max] = arr[r - 1];
            arr[r - 1] = temp;
            SelectionSort(arr, r - 1, 0, 0);
        }
    }
}
