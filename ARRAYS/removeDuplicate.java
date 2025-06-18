package ARRAYS;

public class removeDuplicate {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3, 4, 5, 5};
        System.out.println("Remove duplicate value is : " + Duplicate(arr));
    }
    public static int Duplicate(int[] arr){
        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if(arr[j] != arr[i]){
                arr[i + 1] = arr[j];
                i++;
            }
        }
        return (i+1);
    }
}
