package KK_playlist;

import java.util.*;

public class Switch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name..");
        // String fruits = sc.next();
        // switch (fruits) {
        // case "mango":
        // System.out.println("king of the fruits");
        // break;

        // case "apple":
        // System.out.println("Asweet red fruits");
        // break;

        // case "jacfruit":
        // System.out.println("A vegetable fruits");
        // break;

        // default:
        // System.out.println("enter valid fruits name");
        // }



        // String day = sc.next();
        // switch (day) {
        // case "monday":
        // System.out.println("fast day of monday");
        // break;

        // case "tues":
        // System.out.println("tuesday");
        // break;

        // case "wed":
        // System.out.println("wednesday");
        // break;

        // case "thurs":
        // System.out.println("thursday");
        // break;

        // default:
        // System.out.println("invalid days! Enter valid days name..");
        // }



        // int day = sc.nextInt();
        // switch (day) {
        //     case 1:
        //         System.out.println("fast day of monday");
        //         break;

        //     case 2:
        //         System.out.println("tuesday");
        //         break;

        //     case 3:
        //         System.out.println("wednesday");
        //         break;

        //     case 4:
        //         System.out.println("thursday");
        //         break;

        //     default:
        //         System.out.println("invalid days! Enter valid days..");
        // }



        // int value = sc.nextInt();
        // switch (value) {
        //     case 1:
        //     case 2:
        //     case 3:
        //     case 4:
        //     case 5:
        //     System.out.println("Weekdays");
        //     break;

        //     case 6:
        //     case 7:
        //     System.out.println("Weekends");
        //         break;
        // }



        // nested swiitch
        int emID = sc.nextInt();
        String dept = sc.next();
        
        switch (emID) {
            case 1:
                System.out.println("priyanka");
                break;
            case 2:
            System.out.println("megha");    
                break;

             case 3:
             System.out.println("id number is 12");   

             switch (dept) {
                case "IT":
                 System.out.println("from it department");   
                    break;

                case "managemant":
                System.out.println("from the management department");
                    break;

                    default:
                System.out.println("No department is assigned");
             }
             break;
            default:
            System.out.println("no valid details");
        }
    }
}
