package JavaCodes.Opp1;

import static JavaCodes.A_starting_java.I_Print_Prime_In_Range.checkPrime;
//importing a method of a class from another package

public class A_Intro_class_object_constructor_this_keyword {
    public static void main(String[] args) {

        //using default constructor
        Student a = new Student(); //how to create an object using ref variable that
        // points to obj in heap from stack
        a.name = "Anurag";
        a.roll_no = 3;
        a.marks = 89.55f;
        a.greeting();
        System.out.println(a.name);
        System.out.println(a.roll_no);
        System.out.println(a.marks);


        //using parametrised constructor
        Student b = new Student(4, "Abhinav", 55.45f);
        b.greeting();
        System.out.println(b.name);
        System.out.println(b.roll_no);
        System.out.println(b.marks);

        //using copy constructor
        Student c = new Student(a);
        //object created with ref variable c will use the variables
        // of object created with ref variable a(copied it)
        c.greeting();
        System.out.println(c.name);
        System.out.println(c.roll_no);
        System.out.println(c.marks);
//       for(int i=0;i<1000000000;i++){
//           Student obj=new Student();
//       }
        for(int i=1;i<=20;i++){
            if(checkPrime(i)){
                System.out.print(i+" ");
            }
        }

    }
}
