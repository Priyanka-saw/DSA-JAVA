package KK_playlist.Recur_Level1;

public class Q_8_Palindrome {
    public static void main(String[] args) {

        int num = 121;
        int rev = 0;
        int temp = num;

        while (num > 0) {
            int rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;
        }

        if (temp == rev) {
            System.out.println("palindrome");
        } else {
            System.out.println("palindrom not");
        }
    }
}
 