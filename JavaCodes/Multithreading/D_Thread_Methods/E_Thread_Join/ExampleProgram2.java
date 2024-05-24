package JavaCodes.Multithreading.D_Thread_Methods.E_Thread_Join;

class test extends Thread {
    static Thread main; // Reference of the main thread which is static

    public void run() {
        try {
            // Wait for the main thread to finish
            main.join();
            for (int i = 1; i <= 5; i++) {
                System.out.println("Child thread:" + i);
                Thread.sleep(1000); // Sleep for 1 second
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}


public class ExampleProgram2 {
    public static void main(String[] args) {
        // Set the reference of main thread in the test class
        test.main = Thread.currentThread();
        
        // Create and start the test thread
        test t1 = new test();
        t1.start();
        
        // Main thread's work
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Main thread:" + i);
                Thread.sleep(1000); // Sleep for 1 second
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}