package JavaCodes.Multithreading.F_Synchronization;

// Custom thread class
class Mythread extends Thread {
    // Override the run method to define the thread's task
    public void run() {
        // Synchronize on the current thread object
        synchronized (this) {
            // Loop to print numbers from 0 to 10
            for (int i = 0; i <= 10; i++) {
                System.out.println(i);
                try {
                    // Sleep for 1 second between prints
                    Thread.sleep(1000);
                } catch (Exception e) {
                    // Print any exception that occurs during sleep
                    System.out.println(e.getMessage());
                }
            }
            // Notify any thread waiting on this object after the loop completes
            this.notify();
            this.notifyAll();
        }
    }
}

// Main class to demonstrate inter-thread communication
public class E_InterThreadCommunication {
    public static void main(String[] args) {
        // Create and start the first thread
        Mythread t1 = new Mythread();
        t1.start();

        // Synchronize on the first thread object
        synchronized (t1) {
            try {
                // Main thread waits for t1 to complete its task
                t1.wait();
            } catch (InterruptedException e) {
                // Print any exception that occurs while waiting
                System.out.println(e.getMessage());
            }
        }

        // Create and start the second thread
        Mythread t2 = new Mythread();
        t2.start();
    }
}
