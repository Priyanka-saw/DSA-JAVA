package KK_playlist.Recur_Level2_Arrays;

public class LinearSerach {
    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Search(arr));

    }
    static boolean Search(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] >= arr[i - 1]){

            }else{
                return false;
            }
        }
        return true;
    }
}
