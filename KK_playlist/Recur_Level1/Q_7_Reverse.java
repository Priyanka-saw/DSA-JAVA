package KK_playlist.Recur_Level1;

public class Q_7_Reverse {

    static int sum = 0;

    static void ReverseNo(int n) {

        if (n == 0) {
            return;
        }
        int rem = n % 10;
        sum = sum * 10 + rem;
        ReverseNo(n / 10);
    }

    public static void main(String[] args) {
        ReverseNo(234);
        System.out.println("reverse of the number is : " + sum);
    }

}
