package KK_playlist.Recur_Level2_Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class arrayList {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6, 4};
        System.out.println(Arrays.toString(arr));
        System.out.println(FindAllIndex(arr, 4, 0, new ArrayList<>()));
         
    }

    static ArrayList<Integer> FindAllIndex(int[] arr, int target, int index, ArrayList<Integer> list){
        if(index == arr.length) {
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }
        return FindAllIndex(arr, target, index + 1, list);
    }
}
