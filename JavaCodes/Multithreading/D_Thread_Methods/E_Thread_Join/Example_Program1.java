package JavaCodes.Multithreading.D_Thread_Methods.E_Thread_Join;

class test extends Thread {
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Child thread:" + i);
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

public class Example_Program1 {
    public static void main(String[] args) {
        test t1 = new test();
        t1.start();

        try {
            t1.join();//this will first execute the child thread and then the main thread will excute
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Main thread:" + i);
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
