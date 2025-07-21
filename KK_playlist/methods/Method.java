package KK_playlist.methods;

import java.util.Scanner;

public class Method {
    public static void main(String[] args) {
        // sum();
        // System.out.println(sum2());

        System.out.println(sum3(11, 3));
    }

    

    // pass the value of number when you are calling the methods in main() through the arguments 
    static  int sum3(int a, int b){
        System.out.println("enter number ..");
        int temp = a + b;
        return temp;
    }

    // returning value
    static int sum2() {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter number ..");

        int a = sc.nextInt();
        int b = sc.nextInt();

        int temp = a + b;
        return temp;
    }


    static void sum() {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter number ..");

        int a = sc.nextInt();
        int b = sc.nextInt();

        int temp = a + b;
        System.out.println("sum of the number is : " + temp);

    }
}
