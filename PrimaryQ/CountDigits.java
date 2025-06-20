package PrimaryQ;

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value");
        int n = sc.nextInt();

        int digit = 0;
        while (n != 0) {
            n = n / 10;
            digit++;
        }
        System.out.println("Number of digits are : " + digit);
    }
}
