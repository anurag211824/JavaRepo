package JavaCodes.Exceptions_Handling.Checked_Exceptions;

public class Main_Checked_Exception {
    public static void main(String[] args) {

       try{
        //    FileInputStream f1=new FileInputStream("C:/abc.txt");
           //here we have to need to use try block because compiler will
           //force us to check the exception in case we don't find the C:/abc.txt
       }
       catch(Exception e){
           System.out.println(e.getMessage());
       }
        System.out.println("Hello");
       
        //FileInputStream f1=new FileInputStream("C:/abc.txt");
      


    }
}
