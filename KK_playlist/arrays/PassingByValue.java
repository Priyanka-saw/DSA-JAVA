package KK_playlist.arrays;

import java.util.Arrays;

public class PassingByValue {
    public static void main(String[] args) {
        
        int[] nums = {1 ,2, 3, 4, 5};
        System.out.println(Arrays.toString(nums));

        change(nums);
        System.out.println(Arrays.toString(nums));
    }

    static void change(int[] arr){
        arr[0] = 23;
    }
}
