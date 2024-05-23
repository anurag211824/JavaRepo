package JavaCodes.Opp2;

public class Static_Non_Static {
    public static void main(String[] args) {
     Function2();
     //as main is static it does not need any object/instances
        // for function call
        Static_Non_Static obj =new Static_Non_Static();
        obj.Function3();
    }
    //this is a static function
    static void Function2(){
        //we can not use this Function1 below because
        //it requires an object/instance  but the function
        //in which we are using Function1 does not depend on
        //object/instance.
        //Function1(); error

        // Basically you cannot access non-static stuff without
        // referencing their instances/object creation in a static context

        // hence, here I am referencing it
        Static_Non_Static obj = new Static_Non_Static();
        obj.Function1();
    }
    //this is a non-static function
    void Function3(){
        // Basically we can access non-static stuff without
        // referencing/object creation their instances in a
        // non-static context
        Function1(); //non-static

    }
    //this is a non-static function
    // we know that something which is not static,
    // belongs to an object
    void Function1(){
        System.out.println("hello");
    }
}
