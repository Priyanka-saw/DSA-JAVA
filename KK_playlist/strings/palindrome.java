package KK_playlist.strings;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        fibo();
        
    }
    
    static void fibo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value");
        String user = sc.nextLine();
        String reversevalue = "";
        for (int i = user.length() - 1; i >= 0; i--) {
            reversevalue += user.charAt(i);
        }
        System.out.println(reversevalue);

        if (user.equalsIgnoreCase(reversevalue)) {
            System.out.println(reversevalue + " : palindrome");
        } else {
            System.out.println(reversevalue + " : not palindrome");
        }
    }

}
