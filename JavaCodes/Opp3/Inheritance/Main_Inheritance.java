package JavaCodes.Opp3.Inheritance;

public class Main_Inheritance {
    public static void main(String[] args) {
    Mobile_phones m1=new Mobile_phones(20000,8,64,5000);

          //m1.name;(parent class can not access the child class properties)-->error

          System.out.println(m1.price);
          //System.out.println(m1.total_Ram);
          //System.out.println(m1.cameraPixels);
          //System.out.println(m1.batteryMah);

        Redmi r1=new Redmi(20000,16,50,10000,"RedmiNote7Pro",7);
        OnePlus o1=new OnePlus(25000,16,64,10000,"OnePlus9Pro",9);
        System.out.println("Mobile Name "+r1.name);
        System.out.println("Price "+r1.price);
        System.out.println("Total_ram "+r1.total_Ram);

        System.out.println();

        System.out.println("Mobile Name "+o1.name);
        System.out.println("Price "+o1.price);
        System.out.println("Total_ram "+o1.total_Ram);

        //Here by the ref variable of Mobile_phones can point to the redmi object but cannot
        //can not access the properties of Redmi class that Mobile_phones class do not have.
        Mobile_phones m2=new Redmi(20000,16,50,10000,"RedmiNote7Pro",7);
        System.out.println(m2.batteryMah);
                
        //System.out.println(m2.name);(parent class can not access the child class properties)

        // there are many variables in both parent and child classes
        // you are given access to variables that are in the ref type i.e. Redmi
        // hence, you should have access to name and series variable
        // this also means, that the ones you are trying to access should be initialised
        // but here, when the obj itself is of type parent class(mobile_phones),
        // how will you call the constructor of child class(Redmi)
        // this is why error
        //Redmi r2=new Mobile_phones(20000,16,50,10000,"RedmiNote7Pro",7)--->error

        System.out.println();
        Redmi_poco rp1=new Redmi_poco(20000,16,50,10000, "poco5",
                7,5);
        System.out.println("Mobile Name "+rp1.name);
        System.out.println("This is mobile_phone of poco having series "+rp1.poco_series);





    }
}
