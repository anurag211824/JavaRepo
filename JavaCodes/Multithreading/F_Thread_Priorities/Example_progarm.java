package JavaCodes.Multithreading.F_Thread_Priorities;

class test extends Thread{
public void run(){
    System.out.println("The name of thread is:"+Thread.currentThread().getName());
    System.out.println("Old Priorities of thread:"+Thread.currentThread().getPriority());
    Thread.currentThread().setPriority(7);
    System.out.println("New Priorities of thread:"+Thread.currentThread().getPriority());
}
}
public class Example_progarm {
    public static void main(String[] args) {
        System.out.println("The name of thread is:"+Thread.currentThread().getName());
        System.out.println("Old Priorities:"+Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(10);
        System.out.println("New Priorities:"+Thread.currentThread().getPriority());

        test t1=new test();
        t1.start();
    
    }
    
}
