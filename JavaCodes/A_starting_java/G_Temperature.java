package JavaCodes.A_starting_java;

import java.util.Scanner;

public class G_Temperature {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("enter temp in C:");
        float tempC=input.nextFloat();
        input.nextLine();
        float tempF=(tempC*9/5)+32;
        System.out.println("temp in F iS:"+tempF);
        input.close();
    }
}
