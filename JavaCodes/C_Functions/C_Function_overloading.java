package JavaCodes.C_Functions;

public class C_Function_overloading {
    public static void main(String[] args) {
    sum(3,4);
    sum(3.9,8.2);
    //Function overloading
    }
   public static void sum(int a,int b){
       System.out.println(a+b);
   }
    public static void sum(double a,double b){
        System.out.println(a+b);
    }
}

/* Method overloading in Java allows you to define multiple methods with the same name in the same class
but with different parameters. The compiler determines which method to call based on the number and types of
arguments passed to it.*/