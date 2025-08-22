package KK_playlist.Recur_Level2_Arrays;

public class Sorted {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 5, 6, 8 };
        System.out.println(SortedArr(arr, 0));

    }

    static boolean SortedArr(int[] arr, int index) {
        // base condition
        if (index == arr.length - 1) {
            return true;
        }

        boolean a = arr[index] < arr[index + 1] && SortedArr(arr, index + 1);
        return a;
    }
}
