package PrimaryQ;

public class ConcatenateTwoSting {
    public static void main(String[] args) {
        Concatenate();
    }

    public static void Concatenate() {
        String string1 = "Hello";
        String string2 = " World";

        String result = string1.concat(string2);
        System.out.println("Concatenate of the two string is : " + result);

    }
}
