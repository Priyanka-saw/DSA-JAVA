package KK_playlist.Recurs_Str_Ques;

public class Skip_Char {
    public static void main(String[] args) {

        // skip("", "Priyanka");

       System.out.println(skip("abasc"));
    }

    // static void skip(String p, String up) {
    //     if (up.isEmpty()) {
    //         System.out.println(p);
    //         return;
    //     }

    //     char ch = up.charAt(0);

    //     if (ch == 'a') {
    //         skip(p, up.substring(1));
    //     } else {
    //         skip(p + ch, up.substring(1));
    //     }
    // }

    static String skip(String up) {
        if (up.isEmpty()) {
            return "";
        }

        char ch = up.charAt(0);

        if (ch == 'a') {
           return  skip(up.substring(1));
        } else {
          return ch + skip(up.substring(1));
        }
    }
}

// subString is used to creat a objects