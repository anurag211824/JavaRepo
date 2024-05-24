package JavaCodes.Multithreading.D_Thread_Methods.E_Thread_Join;

class Medical extends Thread {
    public void run() {
        try {
            System.out.println("Medical Starts");
            Thread.sleep(3000);
            System.out.println("Medical Completed");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
class TestDrive extends Thread {
    public void run() {
        try {
            System.out.println("TestDrive Starts");
            Thread.sleep(5000);
            System.out.println("TestDrive Completed");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
class OfficerSign extends Thread {
    public void run() {
        try {
            System.out.println("OfficerSign Starts");
            Thread.sleep(500);
            System.out.println("OfficerSign Completed");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
public class LicenceDemo {
    public static void main(String[] args) throws InterruptedException {
        Medical m=new Medical();
        TestDrive t=new TestDrive();
        OfficerSign o=new OfficerSign();
        m.start();
        //the join method is static and its need a instance or Object for calling
        m.join();//main thread will for the completion of medical thread 
        t.start();
        t.join();//main thread will for the completion of testDrive thread
        o.start();
        o.join();
    }

}
