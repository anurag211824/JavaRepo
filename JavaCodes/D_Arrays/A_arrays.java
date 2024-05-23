package JavaCodes.D_Arrays;

public class A_arrays {
    public static void main(String[] args) {
        //int []brr={1,2,3,4,5};
        int [] arr; //declaration of array arr is getting defined in stack
        //arr is a ref variable
        arr=new int[5];//initialisation
        //actually here object is being created in the memory(heap)
        //internally this is [0,0,0,0,0]
        System.out.println(arr[3]);

        //string array
        String[] str =new String[5];
        System.out.println(str[4]);
    }
}
