package JavaCodes.B_Conditions_And_Loops;

import java.util.Scanner;

public class B_Largest_of_three_num {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter three numbers:");
        int a=input.nextInt();
        int b=input.nextInt();
        int c=input.nextInt();
        int max=Math.max(Math.max(a,b),c);
        System.out.print("Max number is:");
        System.out.println(max);
        System.out.println("end");
        input.close();
    }
}
