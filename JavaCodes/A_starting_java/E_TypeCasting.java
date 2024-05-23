package JavaCodes.A_starting_java;

import java.util.Scanner;

public class E_TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter a num:");
        // implicit typecasting if we enter integer in float variable it converts
        // automatically in float
        float num1 = input.nextFloat();
        input.nextLine();
        System.out.println(num1);
        int number = 'A'; // number variable will store ascii value of A alphabet which is 65
        System.out.println(number);

        // explicit typecasting we have to convert one data type to other manually
        int num2 = (int) (23.675f);
        System.out.println(num2);

        // automatic type promotion in expressions
        int a = 257;
        byte b = (byte) (a); // 257 % 256 = 1
        System.out.println(b);

        byte x = 40;
        byte y = 50;
        byte z = 100;
        int res = x * y / z;
        System.out.println(res);

        // Final example of Typecasting
        byte q = 42; // range of byte is from -128 to 127 inclusive
        byte w = 9;
        short e = 1024; // range of short is -32,768 to 32,767.
        int i = 5000; // range of int is -2,147,483,648 to 2,147,483,647.
        float t = 5.677f;
        double d = 0.1234;
        double result = (t * q) + ((double) i / w) - (d * e);
        // float+double-double= double (all smaller data type than double converted into
        // double
        System.out.println((t * q) + " " + ((double) i / w) + " " + (d * e));
        System.out.println(result);
        input.close();

    }
}
