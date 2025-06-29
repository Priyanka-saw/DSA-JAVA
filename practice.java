import java.util.Scanner;

public class practice {
    public static void main(String[] args) {

        // factorial number
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            if (number < 0) {
                System.out.println("negative not allowed for factorial");
            } else {
                factorial *= i;
            }
            System.out.println(factorial);
        }
    }
}
