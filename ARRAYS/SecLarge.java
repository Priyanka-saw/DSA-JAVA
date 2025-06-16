package ARRAYS;

public class SecLarge {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("second largest value is " + seclargest(arr));
    }
    public static int seclargest(int[] arr){

        int largest = -1, seclargest = -1;

        // finding largest value
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > largest){
                largest = arr[i];
            }
        }
        // finding second largest value
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > seclargest && arr[i] != largest){
                seclargest = arr[i];
            }
        }
        return seclargest;
    }
}
