package KK_playlist.arrays;

public class Main {
    public static void main(String[] args){
        
        // type of the arrays is same like integer then integer only string then string only 
        // store a roll number
        int a = 23;

        // store person name
        String name = "Priyanka";

        // syntax
        // datatype[] bvariable_name = new datatype[size]

        int[] rollno = new int[5];

        // or directly
        int[] roll = {1, 2, 3, 4, 5};

        int[] rollnos; // declearation of the arrays
       roll = new int[4];  // initialisation : object is being created in the heap
    //    new is used to create object

    System.out.println(roll[1]);

    String[] arr = new String[5];
    System.out.println(arr[1]);

    }
}
