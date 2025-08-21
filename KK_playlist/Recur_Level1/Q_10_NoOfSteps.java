package KK_playlist.Recur_Level1;

public class Q_10_NoOfSteps {
    public static void main(String[] args) {

    }

    public int numberSteps(int num) {
        return helper(num, 0);
    }

    private int helper(int num, int steps) {
        if (num == 0) {
            return steps;
        }
        if (num % 2 == 0) {
            return helper(num / 2, steps + 1);
        }
        return helper(num - 1, steps + 1);
    }
}
