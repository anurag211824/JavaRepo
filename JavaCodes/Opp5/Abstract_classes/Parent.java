package JavaCodes.Opp5.Abstract_classes;

public abstract class Parent {
    int age;
    final int VALUE;
    public Parent(int age) {
        this.age = age;
        VALUE = 32456789;
    }
    void hello(){
        System.out.println("hey");
    }
    void normal() {
        System.out.println("this is a normal method");
    }
    //abstract methods
    abstract void career();
    abstract  void partner();

}
