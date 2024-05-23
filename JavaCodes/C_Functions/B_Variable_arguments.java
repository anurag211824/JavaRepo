package JavaCodes.C_Functions;

import java.util.Arrays;

public class B_Variable_arguments {
    public static void main(String[] args) {
        fun(1,2,3,4,5,6,7,78);
        multiple(1,3,"anurag","abhinav");
    }
    static  void fun(int...numbers){
        System.out.println(Arrays.toString(numbers));
    }
    static void multiple(int a,int b,String...str){
        System.out.print(a+" ");
        System.out.print(b+" ");
        for (String s : str) {
            System.out.print(s + " ");
        }
    }
}

/* In Java, variable arguments, also known as varargs, allow a method to
accept an arbitrary number of arguments of a specified type. This is achieved
by using an ellipsis (...) in the method declaration.*/