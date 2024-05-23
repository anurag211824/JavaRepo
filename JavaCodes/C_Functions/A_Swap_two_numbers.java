package JavaCodes.C_Functions;

public class A_Swap_two_numbers {
    public static void main(String[] args) {
        //int a=10;
        //int b=30;
 //       swap(a,b);
//        In Java, you cannot directly swap primitive variables like int using a function because Java is pass-by-value.
//        When you pass primitive variables to a function, a copy of the value is passed, not the actual variable itself.
//        Therefore, modifications made to the parameters inside the function do not affect the original variables outside
//        the function.
        int[] numbers = {10, 30};
        swap(numbers);
        System.out.println(numbers[0]); // Prints 30
        System.out.println(numbers[1]); // Prints 10

//        In Java, when you pass an array to a method, you're passing a reference to the array object,
//        not a copy of the array.This means that changes made to the elements of the array inside the
//        method will affect the original array outside the method.

//        The array is swapped because arrays are passed by reference in Java,
//       allowing modifications made inside a method to affect the original array.

    }
    public static void swap(int[] numbers) {
        int temp = numbers[0];
        numbers[0] = numbers[1];
        numbers[1] = temp;
    }
    

}
