package PrimaryQ;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter number: ");
        int number = sc.nextInt();

        long fact = 1;
        for (int i = 1; i <= number; i++) {
            if (number < 0) {
                // System.out.println("no factorial is availbale for the negative number");

            } else {
                fact = fact * i;
            }

            System.out.println(fact);
        }
    }
}
