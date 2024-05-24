package JavaCodes.Multithreading.D_Thread_Methods.F_Thread_Interrupt;
class test extends Thread{
    public void run(){
        /*
        System.out.println(Thread.interrupted());
        System.out.println(Thread.currentThread().isInterrupted());
        */
        System.out.println(Thread.interrupted());
        //this will chnage return the status of thread true or false
        // and then changes the status from true to false or false to true
        
        System.out.println(Thread.currentThread().isInterrupted());
        //this will  only show the status of thread nothing else
        try{
            for (int i = 1; i <= 5; i++) {
                System.out.println(i);
                Thread.sleep(1000); // Sleep for 1 second
            }
        }
        catch(Exception e){
          System.out.println("Thread Interrupted :"+e);
        }
    }
}
public class B_IsInerrupted_Interrupted_Demo {
    public static void main(String[] args) {
        test t1=new test();
        t1.start();
        t1.interrupt();
    }
}
