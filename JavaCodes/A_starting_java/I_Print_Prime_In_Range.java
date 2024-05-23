package JavaCodes.A_starting_java;

import java.util.Scanner;

public class I_Print_Prime_In_Range {
    public static  boolean checkPrime(int a){
        if(a<2)return false;
        for(int i=2;i*i<a;i++){
            if(a%i==0)return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter n1:");
        int n1=input.nextInt();
        input.nextLine();
        System.out.print("Enter n2:");
        int n2=input.nextInt();
        input.nextLine();
        for(int i=n1;i<=n2;i++){
            if(checkPrime(i)){
                System.out.print(i+" ");
            }

        }
        input.close();
    }
}