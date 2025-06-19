package PrimaryQ;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value");
        int n = sc.nextInt();

        int count = 0;
         for (int i = 2; i*i <= n; i++) {
           if(n % 2 == 0){
            count++;
            break;
           } 
         }
         if(count == 0){
            System.out.println("prime number");
         } 
         else {
            System.out.println("Not prime number");
         }
    }
}
