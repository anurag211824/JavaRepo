package JavaCodes.A_starting_java;

import java.util.Scanner;

public class B_Inputs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your roll number:");
        int rollno = input.nextInt();
        input.nextLine(); // Consume newline character left by nextInt()
        System.out.println("Your roll no is:" + rollno);

        System.out.print("Please enter your name:");
        String name1 = input.nextLine(); // Do not get terminated after a space
        System.out.println(name1);

        System.out.print("Please enter your marks:");
        float marks = input.nextFloat();
        input.nextLine();
        System.out.println(marks);
        System.out.print("please give your college name:");
        String college = input.nextLine();
        System.out.println(college);
        // Instead of int a=234,000,000 we do this
        int a = 234_000_000;
        System.out.println(a);

        // Close the Scanner object to release resources
        input.close();
    }
}
