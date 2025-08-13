package KK_playlist.strings;

import java.util.Arrays;

public class MethodsClass {
    public static void main(String[] args){

        String name = "priyanka kumari ";
        System.out.println(Arrays.toString(name.toCharArray()));

        // string will not change the value so creating a new objects
        System.out.println(name.toLowerCase());
        System.out.println(name);

        System.out.println(name.indexOf('i'));

        System.out.println(name.concat("saw"));
    
        System.out.println(name.split("kjk"));

        System.out.println(name.indexOf(name, 2, 5));
    }
}
