package JavaCodes.D_Arrays;

import java.util.Arrays;

public class C_Arrays_mutable {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5};
        System.out.println(Arrays.toString(arr));
        update(arr,3);
        System.out.println(Arrays.toString(arr));

    }
    public static void update(int []arr,int index){
        arr[index]=100;
    }
}
