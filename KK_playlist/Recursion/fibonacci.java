package KK_playlist.Recursion;

public class fibonacci {
    public static void main(String[] args) {

        // 0, 1, 1, 2, 3, 5, 8
       System.out.println(fibo(50));
    }

//    public static void fibo() {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter value");
//         int user = sc.nextInt();
//         int a = 0;
//         int b = 1;
//         for (int i = 0; i < user; i++) {
//             System.out.println(a);
//             int temp = a + b;
//             a = b;
//             b = temp;
//         }
//     }


// fibo(n) = fibo(n - 1) + fibo(n - 1) 

static int fibo(int n){

    // base condition
    if(n < 2){
        return n;
    }

    return fibo(n - 1) + fibo(n - 2);
}


}
