package JavaCodes.B_Conditions_And_Loops;

import java.util.Scanner;

public class F_Switch_case {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String fruits=input.next();
        System.out.print("Enter a fruits:");
        switch (fruits){
            case "Mango":
                System.out.println("King of fruits");
                break;
            case "Apple":
                System.out.println("Sweet red fruits");
                break;
            case "Orange":
                System.out.println(" round orange fruits");
                break;
            case "Grapes":
                System.out.println("Small fruits");
                break;
            default:
                System.out.println("Please enter a valid fruits");
        }
        input.close();
    }
}
