package JavaCodes.Exceptions_Handling.throw_and_throws_keyword;

public class ExampleClass {

    public static void main(String[] args) {
        try {
            // Call the method that might throw an exception
            exampleMethod();
        } catch (ArithmeticException e) {
            // Handle arithmetic exceptions (e.g., division by zero)
            System.out.println("Arithmetic Exception occurred: " +
                    e.getMessage());
        }
    }
    public static void exampleMethod() throws ArithmeticException {
        try {
            // Code that might throw an exception
            //int result = 10 / 0; // Example: division by zero
        } catch (ArithmeticException e) {
            // Handle the specific exception (if needed)
            throw e; // Rethrow the exception to the caller
        }
    }

}
