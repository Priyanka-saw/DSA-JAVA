package KK_playlist.Recur_Pattern;

public class triangleP {
    public static void main(String[] args) {
        trianglePatt(4, 0);
    }

    static void trianglePatt(int r, int c) {
        if (r == 0) {
            return;
        }
        if (c < r) {
            System.out.print(" * ");
            trianglePatt(r, c + 1);
        } else {
            System.out.println();
            trianglePatt(r - 1, 0);
        }
    }
}
