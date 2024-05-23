package JavaCodes.Opp4.Access_contols;

public class Demo2 extends Main_Access_controls{
    public static void main(String[] args) {
        Demo2 obj=new Demo2();
        //obj.num1 (num1 is declared as private in Main_Access_controls so can't be accessed)

        obj.num2=8;
        System.out.println(obj.num2);//(num2 is declared as protected in Main_Access_controls so can be accessed)

        obj.num3=8;
        System.out.println(obj.num3);//(num3 is declared as default in Main_Access_controls so can be accessed)

    }
}
