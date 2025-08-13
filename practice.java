import java.util.Scanner;

public class practice {

    public static void main(String[] args) {

        // factorial
        // int fact = 1;
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter number");
        // int user = sc.nextInt();

        // for(int i = 1; i <= user; i++){
        //     fact = fact * i;
        // }
        // System.out.println(fact);


        // fibonacci
        // 0, 1, 1, 2, 3, 5, 8
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter");
        
        int user = sc.nextInt();
        int first = 0;
        int sec = 1;

        for (int i = 1; i < user; i++) {
            System.out.println(first);

            int temp = first + sec;
            first = sec;
            sec = temp;
        }


    }
}
