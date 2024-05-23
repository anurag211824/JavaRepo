package JavaCodes.Multithreading;

import static JavaCodes.A_starting_java.I_Print_Prime_In_Range.checkPrime;

public class PrintPrime extends Thread{
   public void run(){
        for(int i=1;i<=100;i++){
            if(checkPrime(i)){
                System.out.println("Prime:"+i);
            }
        }
    }

}
