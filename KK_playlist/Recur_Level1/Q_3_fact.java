package KK_playlist.Recur_Level1;

public class Q_3_fact {
    public static void main(String[] args) {
      System.out.println("factorial of a number is : " + fact(5));

    } 
    static int fact(int n){
        if(n <= 1){
            return 1;
        }

        return n * fact(n - 1);
    }
}
