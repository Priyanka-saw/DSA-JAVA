package PrimaryQ;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        
        // 0, 1, 1, 2, 3, 5, 8, 13, 21, ....
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value : ");
        int userInput = sc.nextInt();
        int a1 = 0;
        int a2 = 1;

        System.out.println("Fibonacci Series : " + userInput);
        for(int i = 1; i <= userInput; i++){
            System.out.println(a1);
            int a3 = a1 + a2;   // a3 = 0 + 1 = 1
            a1 = a2;           // 0 = 1
            a2 = a3;           // 1 = 1
        }

    }
} 
