package KK_playlist.methods;

import java.util.Arrays;

public class OverLoading {
    public static void main(String[] args) {
        
        fun(23);
        fun("priyanka");
        System.out.println(sum(1, 3));

        name(12, 12, 43, 43, 54);
        

    }

    static void name(int ...v){
        System.out.println(Arrays.toString(v));
    }

    static  int sum(int a, int b){
        return a + b;
    }
    // overloading
    // smae type of functi9on but different type of arguments
    static void fun(int a){
        System.out.println(a);
    }

    static void fun(String name){
        System.out.println(name);
    }
}
