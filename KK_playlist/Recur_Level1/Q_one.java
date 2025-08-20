package KK_playlist.Recur_Level1;

public class Q_one {
    public static void main(String[] args) {
        fun(5);
    }

    static void fun(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        fun(n - 1);
    }
}
