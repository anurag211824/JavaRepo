package JavaCodes.Opp2;

public class Human {
    String name;
    int age;
    int salary;
    boolean married;
    static long population;
    //it is common to every object created. if any change is done by
    // any object it is changed for every object.example for every human born human
    //population is increased for all.
    static void message(){
        System.out.println("Hello world !");
        //System.out.println(this.age);
        //JavaCodes.Opp2.Human.this' cannot be referenced from a static context
    }
    public Human(String name,int age,int salary,boolean married){
        this.age=age;
        this.name=name;
        this.salary=salary;
        this.married=married;
        //this.population+=1;
        Human.population+=1;

    }
}


