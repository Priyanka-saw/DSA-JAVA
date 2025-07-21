package KK_playlist.methods;

public class Scope {
    public static void main(String[] args) {
        
        int a = 23;
        int b = 12;

    }

    // function scope
    static void random(int marks){
        int num = 89;

        System.out.println(num);
        System.out.println(marks);
    }
}
