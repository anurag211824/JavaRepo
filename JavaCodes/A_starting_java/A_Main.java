package JavaCodes.A_starting_java;
import java.util.Scanner;
public class A_Main {

    public static void main(String[] args) {
        System.out.println("Hey how are you!");
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("pls enter the number:");
            int a=input.nextInt();
            System.out.println(a);
            float b=input.nextFloat();
            System.out.println(b);
//        System.out.println(input.nextInt());
        }
    }
}
