package KK_playlist.Recur_Level1;

public class Q_two {
    public static void main(String[] args) {
        func(1);
    }
    static void func(int n){
        if (n == 6) {
            return;
        }
        System.out.println(n);
        func(n + 1);
    }
}
