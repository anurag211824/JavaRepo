package JavaCodes.B_Conditions_And_Loops;

public class A_Do_while_loop {
    public static void main(String[] args) {
        int a = 1;
        do {
            // Code to execute inside the do-while loop
            System.out.println("a is: " + a);
            a++; // Incrementing 'a' to avoid infinite loop
        } while (a <= 5); // Condition for the do-while loop
    }
}
