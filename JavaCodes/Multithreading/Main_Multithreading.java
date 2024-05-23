package JavaCodes.Multithreading;

class PrintEven extends Thread{
    public void run(){
        for(int i=1;i<=100;i++){
            if(i%2==0){
                System.out.println("Even:"+i);
            }
        }
    }
}
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

