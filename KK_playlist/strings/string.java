package KK_playlist.strings;
public class string {
    public static void main(String[] args) {

        // string
        int a = 23;
        System.out.println(a);
        a = 34;
        System.out.println(a);


        // decleare it
        String name = "Priyanka";
        System.out.println(name);

        name = "kumari";
        System.out.println(name);


        // not changing the value just creating a new object
        // immutable (once declear it cannot change value why for the security purposes)
        // it will store in the string pool(separate memory structure inside the heap)
        // when value be same, it is in pool


        String ab = "piya";
        String ba = "piya";
        System.out.println(ab == ba);  //true
        // pointing to the same objects


        // now creating these values outside the pool but inside the heap
        String name1 = new String("riki");
        String name2 = new String("riki");

        // using comparator
        // two different objects
        // System.out.print(name1 == name2);   //false

        // using method
        System.out.println(name1.equals(name2));  //true


    }
}
