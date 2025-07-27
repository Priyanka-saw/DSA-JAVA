package KK_playlist.arrays;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEg {
    public static void main(String[] args) {
        
        // syntax
        ArrayList<Integer> list = new ArrayList<>(12);
        Scanner sc = new Scanner(System.in);

        // capacity of the arraylist is not matter
        list.add(78);
        list.add(12);
        list.add(34);
        list.add(75);
      
        // System.out.println(list.contains(23));
        // System.out.println(list.remove(2));
        // System.out.println(list);

        // inputs
        for (int i = 0; i < 10; i++) {
            list.add(sc.nextInt());
        }
        
        // get item at any item
        for (int i = 0; i < 10; i++) {
            System.out.println(list.get(i));
            
        }
        System.out.println(list);

    }
}
