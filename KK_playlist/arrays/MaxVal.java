package KK_playlist.arrays;

public class MaxVal {
    public static void main(String[] args) {
        
        int[] arr = {1, 2, 3, 4, 5};

       System.out.println(maxValue(arr));
    }

    static int maxValue(int[] arr){
        int temp = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > temp){
                temp = arr[i];
            }
        }
        return temp;
    }
}
