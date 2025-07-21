package KK_playlist.methods;

public class swap {
    public static void main(String[] args) {

        // Scanner sc = new Scanner(System.in);
        // int[] nums = new int[2];

        int[] nums = { 1, 3 };

        // nums[0] = sc.nextInt();
        // nums[1] = sc.nextInt();

        swap(nums);
        System.out.println(nums[0] + " " + nums[1]);
    }

    static void swap(int[] arr) {
        int temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;

    }
}
