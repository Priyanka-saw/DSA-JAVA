import java.util.Scanner;

public class practice {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int first = sc.nextInt();
        int second = sc.nextInt();

        // int first = 12;
        // int second = 13;
        // System.out.println(first + " " + second);

        // first = first + second;
        // second = first - second;
        // first = first - second;

        first = first ^ second;
        second = first ^ second;
        first = first ^ second;

        System.err.println(first + " " + second);
    }
}
