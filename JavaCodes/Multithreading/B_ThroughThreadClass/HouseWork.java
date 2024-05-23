package JavaCodes.Multithreading.B_ThroughThreadClass;

class Cooking extends Thread {
    public void run() {
        int i = 0;
        while (i < 100) {
            System.out.println("Food is cooking");
            i++;
        }
    }
}

class Washing extends Thread {
    public void run() {
        int i = 0;
        while (i < 100) {
            System.out.println("Cloths are washing");
            i++;
        }
    }
}

public class HouseWork {
    public static void main(String[] args) {
        Cooking t1 = new Cooking();
        Washing t2 = new Washing();
        t1.start();
        t2.start();
    }
}
