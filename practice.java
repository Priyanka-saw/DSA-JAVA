
public class practice {
    public static void main(String[] args) {

        // factorial number
        // Scanner sc = new Scanner(System.in);
        // String number = sc.nextLine();

        // String valuecpm = "";
        // for(int i = number.length()-1; i >= 0; i--){
        //     valuecpm += number.charAt(i);
        // }
        // if(number.equalsIgnoreCase(valuecpm)){
        //     System.out.println("palindrome");
        // } else{
        //     System.out.println("not palindrome");
        // }

        // find second largest number
        int arr[] = {1, 2, 3, 4, 5};
        System.out.println("second largest numebr is : " + secMax(arr) );
    }
    public static int secMax(int[] arr){
        int max = -1, secmax = -1;

        // find largest number
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        // find seclagest value
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > secmax && arr[i] != max){
                secmax = arr[i];
            }
        }
        return secmax;
    }
}
