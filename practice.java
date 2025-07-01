import java.util.Scanner;

public class practice {
    public static void main(String[] args) {

        // factorial number
        Scanner sc = new Scanner(System.in);
        String number = sc.nextLine();

        String valuecpm = "";
        for(int i = number.length()-1; i >= 0; i--){
            valuecpm += number.charAt(i);
        }
        if(number.equalsIgnoreCase(valuecpm)){
            System.out.println("palindrome");
        } else{
            System.out.println("not palindrome");
        }
    }
}
