package JavaCodes.Multithreading.C_Different_Cases_Of_Executing_Threads;

public class B_Single_Task_Multiple_Thread {
    public static void main(String[] args) { // main thread created by Java virtual machine
        PrintStar p1 = new PrintStar();// thread1
        PrintStar p2 = new PrintStar();// thread2
        p1.start();
        p2.start();
    }
}

class PrintStar extends Thread {
    public void run() {
        int n = 5; // Number of rows in the pattern

        for (int i = 1; i <= n; i++) { // Outer loop for number of rows
            for (int j = 1; j <= i; j++) { // Inner loop for printing stars
                System.out.print("* ");
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}