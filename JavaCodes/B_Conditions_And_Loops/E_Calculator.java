package JavaCodes.B_Conditions_And_Loops;

import java.util.Scanner;

public class E_Calculator {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int ans=0;
        while(true){
            System.out.print("Enter a operator to do calculations and to exit enter:");
            char ch=input.next().trim().charAt(0);
            if(ch=='+'||ch=='-'||ch=='*'||ch=='/'||ch=='%'){
                System.out.print("Enter num1 and num2:");
                int num1=input.nextInt();
                int num2=input.nextInt();
                if(ch=='+'){
                    ans=num1+num2;
                }
                else if(ch=='-'){
                    ans=num1-num2;
                }
                else if(ch=='*'){
                    ans=num1*num2;
                }
                else if(ch=='/'){
                    if(num2!=0){
                        ans=num1/num2;
                    }
                }
                else{
                    ans=num1%num2;
                }
            }
            else if(ch=='X'){
                System.out.print("Calculator closed");
                break;
            }
            else{
                System.out.print("Invalid operation");
            }
            System.out.println(ans);

        }
        input.close();
    }
}
