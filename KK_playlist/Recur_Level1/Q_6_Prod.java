package KK_playlist.Recur_Level1;

public class Q_6_Prod {
    public static void main(String[] args) {
        System.out.println("product ofthe number is " + product(2123));

    }

    static int product(int n) {
        if (n%10 == n) {
            return n;
        }
        return (n % 10 * product(n / 10));
    }
}
