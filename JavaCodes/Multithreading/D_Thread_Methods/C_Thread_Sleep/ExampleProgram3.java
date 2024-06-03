package JavaCodes.Multithreading.D_Thread_Methods.C_Thread_Sleep;

class test extends Thread{
    public void run(){
        for(int i=1;i<=5;i++){
            try{
                Thread.sleep(10000);
            }
            catch(InterruptedException e){
                System.out.println(e.getMessage());
            }
            System.out.println(i+Thread.currentThread().getName());
        }
    }
}
public class ExampleProgram3 {
    public static void main(String[] args) {
        test t1=new test();
        t1.start(); //we cant use Run it will start excuting whole run method at a time
        test t2=new test();
        t2.start();
        
    }
}
