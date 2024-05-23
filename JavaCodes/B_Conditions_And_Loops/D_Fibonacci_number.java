package JavaCodes.B_Conditions_And_Loops;
import java.util.Scanner;

public class D_Fibonacci_number {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter n to print nth fibonacci num:");
        int n=input.nextInt();
        int a=0;
        int b=1;
        int c=-1;
        if(n==0){
            System.out.println("Your "+n+" fibonacci number is "+a);
        }
        else if(n==1){
            System.out.println("Your "+n+" fibonacci number is "+b);
        }
        else if(n>1){
            for(int i=2;i<=n;i++){
                c=a+b;
                a=b;
                b=c;
            }
            System.out.println("Your "+n+" fibonacci number is "+c);
        }
        input.close();
    }
}
