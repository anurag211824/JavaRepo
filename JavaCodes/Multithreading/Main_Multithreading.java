package JavaCodes.Multithreading;
public class Main_Multithreading {
    public static void main(String[] args) {
        PrintPrime obj1=new PrintPrime();
        PrintEven obj2=new PrintEven();
        PrintOdd obj3=new PrintOdd();

        obj1.start();
        obj2.start();
        obj3.start();
System.out.println("Hello");


    }

}

