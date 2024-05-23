package JavaCodes.Exceptions_Handling.Finally_keyword;

public class FinallyExample {
    public static void main(String[] args) {
        try {
            // Open a resource (in this case, a file)
            System.out.println("Opening a resource...");
            // Simulating an exception by dividing by zero
            int result = 10 / 0;
            System.out.println("Result: " + result); // This line won't be executed
        } catch (ArithmeticException e) {
            // Handling arithmetic exception
            System.out.println("Arithmetic Exception occurred: " + e.getMessage());
        } finally {
            // Cleanup code that always executes
            System.out.println("Closing the resource...");
        }
    }

}
