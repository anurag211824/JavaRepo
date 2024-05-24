package JavaCodes.Multithreading.D_Thread_Methods.F_Thread_Interrupt;

class test extends Thread{
    public void run(){
     try{
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
            Thread.sleep(1000); // Sleep for 1 second
        }
     }
     catch(Exception e){
System.out.println("Thread interrupted :"+e.getMessage());
     }
    }
}
public class A_Thread_InterruptDemo {
    public static void main(String[] args) {
        test t1=new test();
        t1.start();
        t1.interrupt();
    }
}
