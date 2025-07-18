package KK_playlist;

import java.util.Scanner;

public class Condn_Loops {
    public static void main(String[] args) {
        
        // if statement
        int salary = 10000;
        if(salary > 20000){
            salary += 1000;
        } else {
            salary = salary + 2000;
        }


        // // if else multiple
        if (salary == 100000) {
            salary += 1200;
        }else if(salary > 20000){
            salary += 23000;
        }
        else {
            // System.out.println("invalid salary");
        }


        // loops
        // for loops (we know that the loop will where end)
        // print number upto 1 to 10
        // Scanner sc = new Scanner(System.in);
        // System.out.println("enter value : ");
        //  int n = sc.nextInt();
        // for (int i = 0; i <= n; i++) {
            // System.out.print(" " + i);
        // }


        // while loop
        // we have no idea till upto the loop will run, we use while loop
        int j = 1;
        while(j <= 5){
            // System.out.println(j);
            j++;
        }


        // do while loop
        // at least one time the loop will run

        int n = 1;
        do {
            // System.out.println("do while loop");
        } while (n != 1);


        
        // solving questions
        // 1> largest number
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value");
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int c = sc.nextInt();

        // int max = a;
        // if(b > max){
        //     max = b;
        // }
        // if (c > max){
        //     max = c;
        // }
        // System.out.println("maximum is : " + max);


        // int max = Math.max(c,   Math.max(a, b));
        // System.out.println("maximum number is : " + max);



        // type ckeck
        // char ch = sc.next().trim().charAt(0);
        

        // if(ch >= 'a' && ch <= 'z'){
            // System.out.println("lowercase");
        // } else {
            // System.out.println("upper case");
        // }
        // System.out.println(ch);


        // .fibonacci number
        int fibo = sc.nextInt();
        int a = 0;
        int b = 1;
        for(int i = 1; i <= fibo; i++){
            // System.out.println("fibonacci number is" + a);
            int temp = a + b;
            a = b;
            b = temp;
        }

        // counting  repeated number
        int count = 0;
        while (fibo > 0 ) {
            int rem = fibo % 10;
            if(rem == 5){
                count++;
            }
            fibo = fibo /10;
        }
        // System.out.println("countedd repeated number is : " + count);


        // reserve the number 
        int num = 16234;
        int ans = 0;
        while(num > 0){
            int rem = num % 10;
            num /= 10;
            ans = ans * 10 + rem;
        }
        System.out.println("reverse number is the : " + ans);
    }
}
