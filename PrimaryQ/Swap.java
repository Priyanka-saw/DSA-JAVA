package PrimaryQ;

public class Swap {
    public static void main(String[] args) {
        int a = 12;
        int b = 23;
        System.out.println(a + " " + b);
        // int temp = a;
        // a = b;
        // b = temp;
        // System.out.println(a + " " + b);

        // a = a ^ b;
        // b = a ^ b;
        // a = a ^ b;
        // System.out.println(a + " " + b);

        a = a + b;  //a = 35
        b = a - b; // b = 35 - 23 = 12
        a = a - b;  // a = 35 - 12 = 23
       System.out.println(a + " " + b);

    }
}
