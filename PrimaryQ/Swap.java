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

        a = a + b; // a = 35
        b = a - b; // b = 35 - 23 = 12
        a = a - b; // a = 35 - 12 = 23
        System.out.println(a + " " + b);

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter number");
        // int first = sc.nextInt();
        // int second = sc.nextInt();

        // int first = 12;
        // int second = 13;
        // System.out.println(first + " " + second);

        // first = first + second;
        // second = first - second;
        // first = first - second;

        // first = first ^ second;
        // second = first ^ second;
        // first = first ^ second;

        // System.err.println(first + " " + second);

    }
}
