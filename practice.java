import java.util.Scanner;

public class practice {
    public static void main(String[] args) {

        // factorial number
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

       int fact = 1;
       for(int i = 1; i <= number; i++){
        if(number < 0){
            System.out.println("factorial is not available for non -ve number");
        } else{
            fact *= i;
        }
        System.out.println("factorial : " + fact);
       }
    }
}
