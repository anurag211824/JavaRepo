package JavaCodes.D_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class B_Arrays_input {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("enter the size of array:");
        int len= in.nextInt();
        int[] arr=new int[len];
        for(int i=0;i<len;i++){
            arr[i]= in.nextInt();
        }
        for(int nums:arr){
            System.out.print(nums+" ");
        }
        System.out.println();
        System.out.print(Arrays.toString(arr));
        System.out.println(


        );
        String [] str={"a","b","c","d"};
        System.out.print(Arrays.toString(str));
        in.close();
    }
}
