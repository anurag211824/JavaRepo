package JavaCodes.Multithreading.F_Synchronization;

class printTables {
    synchronized void table(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " X " + i + "=" + n * i);
        }
        System.out.println();
    }
}

class TableThread extends Thread {
    printTables p = new printTables();
    int n;

    TableThread(printTables p, int n) {
        this.p = p;
        this.n = n;
    }

    public void run() {
        p.table(n);
    }
}

public class B_SynchronizationMethod {
    public static void main(String[] args) {

        printTables p = new printTables();
        TableThread t1 = new TableThread(p, 5);
        t1.start();
        TableThread t2 = new TableThread(p, 10);
        t2.start();

    }
}
