package PrimaryQ;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args){

        // User inputs
        Scanner sc = new Scanner(System.in);
        System.out.println("input value");
        String inputUser = sc.nextLine();

        String ReversedValue = "";
        for(int i = inputUser.length() - 1; i >= 0; i--){
            ReversedValue += inputUser.charAt(i);
        }
        System.out.println("Reversed value is :" + ReversedValue);
    } 
}
