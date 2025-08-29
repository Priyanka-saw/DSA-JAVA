package KK_playlist.Recurs_Str_Ques;

public class Skip_Str {
    public static void main(String[] args) {
        System.out.println(skipStr("appledfgddg"));

    }

    static String skipStr(String up) {
        if (up.isEmpty()) {
            return "";
        }

        if (up.startsWith("apple")) {
            return skipStr(up.substring(5));
        } else {
            return up.charAt(0) + skipStr(up.substring(1));
        }
    }
}
