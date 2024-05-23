package JavaCodes.Multithreading.C_Different_Cases_Of_Executing_Threads;

public class A_Single_Task_Single_Thread {
    public static void main(String[] args) {
        PrintStar p1 = new PrintStar();
        p1.start();
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