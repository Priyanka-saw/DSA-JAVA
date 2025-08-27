package KK_playlist.QuickSort_recur;

import java.util.Arrays;

public class quickSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        Sort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
        
    }
    static void Sort(int[] nums, int low, int high){
        if(low >= high){
            return;
        }

        int s = low;
        int e = high;
        int m = s + (e - s)/2;
        int pivot = nums[m];

        while(s <= e){
            while(nums[s] < pivot){
                s++;
            }

            while(nums[e] > pivot){
                e--;
            }

            if(s <= e){
                int temp = nums[s];
                nums[s] = nums[e];
                nums[e] = temp;
                s++;
                e--;
            }
        }

        // now my pivot is at current index plz sort 
        Sort(nums, low, e);
        Sort(nums, s, high);
    }

}










// pivot: choose any element after first pass all the elements < p will be on the LHS of p and element  > p will be at RHS of pivot

// how to choose pivot 
// merge sort is better in linkedlist due to memory allocation -> not continuous