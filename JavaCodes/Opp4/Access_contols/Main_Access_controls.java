package JavaCodes.Opp4.Access_contols;

public class Main_Access_controls {
    private int num1; //The member is accessible only within the same class.
    protected int num2=20; // The member is accessible within the same package and by subclasses
    // (even if they are in a different package).
    int num3;//The member is accessible only within the same package.

    public int num4;//The member is accessible from anywhere.
    public Main_Access_controls(){
        //default constructor
    }

    public static void main(String[] args) {
     Main_Access_controls obj=new Main_Access_controls();

      //1> Accessibility of private member
     obj.num1=3;
     System.out.println(obj.num1);
     //a>This means that a private member can be accessed in the same class Main_Access_controls class.
     //b>private member can not be accessed in the same package but diff class Demo1.
     //c>private member can not be accessed in the same package and Demo2 subclass(inheritance involved).
     //d>private member can not be accessed in the diff package abd Demo3 subclass(inheritance involved).

     //2> Accessibility of protected  member
      obj.num2=4;
      System.out.println(obj.num2);
        //a>This means that a protected member can be accessed in the same class Main_Access_controls class
        // b>protected member can be accessed in the same package but diff class Demo1.
        //c>protected member can be accessed in the same package and Demo2 subclass(inheritance involved).
        //d>protected member can  be accessed in the diff package and Demo3 subclass(inheritance involved).


     //3> Accessibility of Default  member
        obj.num3=34;
        System.out.println(obj.num3);
        //a>This means that a  Default member can be accessed in the same class Main_Access_controls class
        // b> Default member can be accessed in the same package but diff class Demo1.
        //c> Default  member can be accessed in the same package and Demo2 subclass(inheritance involved).
        //d>protected member can't  be accessed in the diff package and Demo3 subclass(inheritance involved).


        //4> Accessibility of Public  member
        //it is available to world

    }
}
