package KK_playlist.Recur_Pattern;

public class TriangleTwo{
    public static void main(String[] args) {

        triangle2Patt(4, 0);
    }

    static void triangle2Patt(int r, int c) {
        // base conditions 
        if (r == 0) {
            return;
        }
        if (c < r) {
            triangle2Patt(r, c + 1);
            System.out.print(" * ");
        } else {
            triangle2Patt(r - 1, 0);
            System.out.println();
        }
    }
}
