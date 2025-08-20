package KK_playlist.Recur_Level1;

public class Q_5_SmDigit {
    public static void main(String[] args){
        System.out.println(sum(123));

    }

    static int sum(int n){
        if(n == 0){
            return 0;

        }
        return (n%10 + sum(n/10));
    }
}
