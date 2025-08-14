package KK_playlist.Recursion;

public class Messages {
    public static void main(String[] args){

        messages();
    
    }
    static void messages(){
        System.out.println("Hello world");    
        messages1();  
    }

    static void messages1(){
        System.out.println("Hello world");   
        messages2();   
    }

    static void messages2(){
        System.out.println("Hello world");  
        messages3();    
    }

    static void messages3(){
        System.out.println("Hello world");    
        messages4();  
    }

    static void messages4(){
        System.out.println("Hello world");      
    }


}
