package JavaCodes.Multithreading.E_Thread_Constructors;

public class ThreadConstructorExample1 {
    public static void main(String[] args) {
        Runnable task = new Task();
        // Here, an instance of Task (which implements the Runnable interface) is created. The Task class provides 
        // the code that will be run by the threads.

        Thread thread1 = new Thread(task, "Thread-One");
        Thread thread2 = new Thread(task, "Thread-Two");

        thread1.start();
        thread2.start();
    }
}

class Task implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " is running, iteration " + i);
        }
    }
}
