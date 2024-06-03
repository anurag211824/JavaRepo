package JavaCodes.Exceptions_Handling.Unchecked_Exceptions;

public class Main_Unchecked_Exception {
    public static void main(String[] args) {
        int a=10;
        int b=0;
        try{
            System.out.println(a/b);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            // e.printStackTrace();
            // System.out.println(e.toString());
        }

        System.out.println("Hello");



    }
}
