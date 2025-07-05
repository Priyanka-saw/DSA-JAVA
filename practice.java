import java.util.*;
public class practice {
    public static void main(String[] args) {

        int arr[] = {11, 12, 13, 14, 15};
    //     System.out.println("Maximum value is : " + MaxVal(arr));
    // }
    // public static int MaxVal(int[] arr){
    //     int max = -1, secmax = -1;
    //     for (int i = 0; i < arr.length; i++) {
    //         if(arr[i] > max){
    //             max = arr[i];
    //         }
    //     }
    //     for (int i = 0; i < arr.length; i++) {
    //         if(arr[i] > secmax && arr[i] != max){
    //             secmax = arr[i];
    //         } 
    //     }
    //     return  secmax;

    System.out.println("sorted value : " + sortedval(arr));
        System.out.println(Arrays.toString(arr));
    }
    public static boolean sortedval(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] >= arr[i - 1]) {

            } else{
                return false;
            }
        }
        return true;
    }
}
