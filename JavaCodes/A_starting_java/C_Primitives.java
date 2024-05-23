package JavaCodes.A_starting_java;

public class C_Primitives {
    public static void main(String[] args) {
        int rollno=3;//4 bytes
        System.out.println(rollno);

        //String is not primitive
        String name="anurag";
        System.out.println(name);

        char letter='a';//1 byte
        System.out.println(letter);

        float marks=98.34f;//4 bytes
        System.out.println(marks);

        double largeDecimalNumbers=4567654.4567;//8 bytes
        System.out.println(largeDecimalNumbers);

        long largeInteger=554423686843333334L;//8 bytes
        System.out.println(largeInteger);

        boolean check=false;
        System.out.println(check);

        /*
        wrapper class
        add some functionalities to primitives
        Integer roll=34;
        roll.doubleValue();
        */


    }
}

