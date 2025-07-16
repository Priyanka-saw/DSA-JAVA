package KK_playlist;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // taking input from the user util user does not press the x
        while (true) {

            // taking operator
            System.out.println("Enter operator");
            char op = sc.next().trim().charAt(0);
            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {

                // input two number
                System.out.println("Enter value to calculate");
                int num1 = sc.nextInt();
                int num2 = sc.nextInt();
                int ans = 0;

                if (op == '+') {
                    ans = num1 + num2;
                }
                if (op == '-') {
                    ans = num1 - num2;
                }
                if (op == '*') {
                    ans = num1 * num2;
                }
                if (op == '%') {
                    ans = num1 % num2;
                }
                if (op == '/') {
                    if (num2 != 0) {
                        ans = num1 / num2;
                    }
                } 
                else if (op == 'x' || op == 'X') {
                    break;
                    
                } else {
                    // System.out.println("invalid operator...");
                }
                System.out.println(ans);
            }

        }
    }
}
