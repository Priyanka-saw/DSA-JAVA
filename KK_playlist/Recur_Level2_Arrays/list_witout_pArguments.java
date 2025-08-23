package KK_playlist.Recur_Level2_Arrays;

import java.util.ArrayList;

public class list_witout_pArguments {
    public static void main(String[] args) {

        int[] arr = {1, 2, 4, 6, 4};
        System.out.println(FindAllIndex2(arr, 6, 0));
    }

    static ArrayList<Integer> FindAllIndex2(int[] arr, int target, int index) {
        ArrayList<Integer> list = new ArrayList<>();

        if (index == arr.length) {
            return list;
        }

        // this will contain answer for that funcion call only
        if (arr[index] == target) {
            list.add(index);
        }
        ArrayList<Integer> ansFromBelowCall =  FindAllIndex2(arr, target, index + 1);

        list.addAll(ansFromBelowCall);
        return list;
    }

}
