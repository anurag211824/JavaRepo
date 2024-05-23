package JavaCodes.Multithreading;

public class PrintEven extends Thread{
    public void run(){
        for(int i=1;i<=100;i++){
            if(i%2==0){
                System.out.println("Even:"+i);
            }
        }
    }
}
