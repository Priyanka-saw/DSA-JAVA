package ARRAYS;

public class practices {
    public static void main(String[] args) {
        
        int arr[] = {1, 2, 3, 4, 5};
        System.out.println("maximum value is " + maxval(arr));
    }

    public static int maxval(int[] arr){
        int max = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}
