package KK_playlist.Recur_Level1;

public class Q_4_Sum {
    public static void main(String[] args){
        System.out.println("Sum of the number is : " + sumNo(5));
    }

    static int sumNo(int n) {
        if(n <= 1){
            return 1;
        }
        return n + sumNo(n - 1);
    }
}
