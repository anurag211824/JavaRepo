package JavaCodes.Multithreading.A_ThroughRunnableInterface;

class myThread1 implements Runnable {
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("I am Thread 1");
        }
    }
}

class myThread2 implements Runnable {
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("I am Thread 2");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        myThread1 r1 = new myThread1();
        Thread t1 = new Thread(r1);
        myThread2 r2 = new myThread2();
        Thread t2 = new Thread(r2);
        t1.start();
        t2.start();
    }
}
