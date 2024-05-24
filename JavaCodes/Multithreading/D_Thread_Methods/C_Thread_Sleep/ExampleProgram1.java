package JavaCodes.Multithreading.D_Thread_Methods.C_Thread_Sleep;

public class ExampleProgram1 {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            try{
                Thread.sleep(500);
            }
            catch(Exception e){
              System.out.println(e.getMessage());
            }
            System.out.println(i);
        }
    }
}
