package JavaCodes.B_Conditions_And_Loops;

import java.util.Scanner;

public class C_Alphabet_case_check {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        char ch=input.next().trim().charAt(0);
        if(ch>='a'&& ch<='z'){
            System.out.print("Given alphabet is in lowercase");
        }
        else{
            System.out.print("Given alphabet is in uppercase");
        }
        input.close();
    }
}
