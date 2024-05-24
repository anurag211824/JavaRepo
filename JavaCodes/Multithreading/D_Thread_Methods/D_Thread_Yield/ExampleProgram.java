package JavaCodes.Multithreading.D_Thread_Methods.D_Thread_Yield;
class test extends Thread{
    public void run(){
        Thread.yield();
        for(int i=1;i<=5;i++){
            System.out.println(Thread.currentThread().getName()+i);
        }
    }
}
public class ExampleProgram {
    public static void main(String[] args) {
        Thread.yield();
        for(int i=1;i<=5;i++){
            System.out.println(Thread.currentThread().getName()+i);
        }
        test t1=new test();
        t1.start();
    }
}
