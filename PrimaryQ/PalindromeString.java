package PrimaryQ;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {

        // for string
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string for check : ");

        String UserString = sc.nextLine();

        // reverse the string
        String reverseValue = "";
        for (int i = UserString.length() - 1; i >= 0; i--) {
            reverseValue += UserString.charAt(i);
        }
        System.out.println("reversed value is : " + reverseValue);

        // check the palindrome
        if (UserString.equalsIgnoreCase(reverseValue)) {
            System.out.println("string is palindrome : " + reverseValue);
        } else {
            System.out.println("String is Not palindrome : " + reverseValue);
        }
    }
}
