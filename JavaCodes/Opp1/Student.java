package JavaCodes.Opp1;

public class Student {
    String name;
    int roll_no;
    float marks;
    Student(){
        //default constructor
    }
    Student (int rno, String name, float marks) {
        this.roll_no = rno;
        this.name = name;
        this.marks = marks;
        //parameterised constructor
    }
    Student(Student copy){
        this.name= copy.name;
        this.roll_no= copy.roll_no;
        this.marks= copy.marks;
        //copy constructor
    }

    // A function inside the Student class
    void greeting() {
        System.out.println("Hello! My name is " + this.name);
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object is destroyed");
    }

}
