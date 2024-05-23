package JavaCodes.Opp3.Polymorphism.Compiletime;
//Compile-time  Polymorphism (Method Overloading)
public class Main_polymorphism {
   void sum(int a, int b){
        System.out.println(a+b);
    }
    void sum(double a,double b){
        System.out.println(a+b);
    }
    public static void main(String[] args) {

        Main_polymorphism obj1=new Main_polymorphism();
        obj1.sum(2,4);

        Main_polymorphism obj2=new Main_polymorphism();
        obj2.sum(3.555,7.343);

    }
}
