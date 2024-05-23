package JavaCodes.Multithreading.E_Thread_Constructors;

public class ThreadConstructorExample2 {
    public static void main(String[] args) {
        NamedThread thread1 = new NamedThread("NamedThread-One");//constructor for giving the name to the thread
        NamedThread thread2 = new NamedThread("NamedThread-Two");//constructor for giving the name to the thread

        thread1.start();
        thread2.start();
    }
}

class NamedThread extends Thread {
    NamedThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 1; i <=5; i++) {
            System.out.println(getName() + " is running, iteration " + i);
        }
    }
}
