package KK_playlist.arrays;
import java.util.Arrays;

public class swap {
    public static void main(String[] args){

        int[] arr = {1, 3 ,43, 13};

        System.out.println(Arrays.toString(arr));
        swaps(arr, 1, 2);

        System.out.println(Arrays.toString(arr));
    }

    // swaping between the arrays
    static void swaps(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;

        
    }
}
