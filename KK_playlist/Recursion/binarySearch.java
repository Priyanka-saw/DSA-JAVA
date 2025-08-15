package KK_playlist.Recursion;

public class binarySearch {
    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5, 44, 66};
        int target = 6;
        int reault = Search(arr, target, 0, arr.length - 1);
        System.out.println(reault);

    }
    // it give index value 
// s= start, e = end, m = midle, 
    static int Search(int[] arr, int target, int s, int e) {

        if (s > e) {
            return -1;

        }
        int m = s + (e - s) / 2;

        if (arr[m] == target) {
            return m;
        }
        if (target < arr[m]) {
            return Search(arr, target, s, m - 1);
        }

       return  Search(arr, target, m + 1, e);

    }
}
