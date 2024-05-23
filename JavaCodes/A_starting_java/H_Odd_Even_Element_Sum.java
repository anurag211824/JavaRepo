package JavaCodes.A_starting_java;

public class H_Odd_Even_Element_Sum {
    public static void main(String[] args) {


        int []arr = {1,2,3,4,5,6,7,8,9,10};
        int sum_Even = 0 ;
        int sum_Odd = 0 ;
        for(int num : arr){
            if(num%2==0){
                sum_Even+=num;
            }else{
                sum_Odd+=num;
            }
        }
        System.out.println("Sum of even numbers are " + sum_Even);
        System.out.println("Sum of odd numbers are " + sum_Odd);
    }
}
