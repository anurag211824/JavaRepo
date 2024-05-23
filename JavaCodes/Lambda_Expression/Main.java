package JavaCodes.Lambda_Expression;

interface MyAdder {
    int add(int a, int b);
}
public class Main {
    public static void main(String[] args) {
        //Here's how you would implement myAdder interface using an anonymous class:
        //An anonymous class is a one-time use class without a name that is both declared 
        //and instantiated in a single expression.
        MyAdder adder = new MyAdder() {
            @Override
            public int add(int a, int b) {
                return a + b;
            }
        };
        System.out.println(adder.add(5, 3)); // Output: 8

        //With a lambda expression, it looks like this:
        MyAdder abc = (a, b) -> a + b;
        System.out.println(abc.add(5, 3)); // Output: 8
    }
}
