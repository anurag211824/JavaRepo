package JavaCodes.Multithreading.D_Thread_Methods.A_Thread_Naming;

class thread1 extends Thread{
    public void run(){
      System.out.println("Thread Task:"+Thread.currentThread().getName());
    }
}
public class A_Thread_Naming {
    public static void main(String[] args) {
        //System.out.println("Old threadName:"+Thread.currentThread().getName());
        //used to get the name of current thread
        //Thread.currentThread().setName("Anurag");
        //used to set the name of current thread
        //System.out.println("New threadName"+Thread.currentThread().getName());
        // System.out.println(10/0);
        

        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().isAlive());

        thread1 t1=new thread1();
        t1.setName("Anurag");//used to set the name of thread 
        t1.start();


        thread1 t2=new thread1();
        t2.setName("Abhinav");//used to set the name of thread 
        t2.start();


    }
    
}
