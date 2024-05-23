package JavaCodes.Opp3.Polymorphism.Runtime;

//Runtime polymorphism  (Method Overriding)
public class Main_polymorphism {
    public static void main(String[] args) {
        Shape circle=new Circle();
        Shape triangle=new Triangle();
        Shape square=new Square();
        circle.Area();
        square.Area();
        triangle.Area();
        Circle c1=new Circle();
        c1.Area();
    }
}
