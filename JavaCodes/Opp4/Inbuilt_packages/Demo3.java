package JavaCodes.Opp4.Inbuilt_packages;

import JavaCodes.Opp4.Access_contols.Main_Access_controls;

public class Demo3 extends Main_Access_controls {
    public static void main(String[] args) {
        Demo3 obj=new Demo3();
        //obj.num1(num1 is declared as private in Main_Access_controls so can't be accessed)

        obj.num2=23;
        System.out.println(obj.num2);//(num2 is declared as protected in Main_Access_controls so can be accessed)

        //obj.num3=8;
        //System.out.println(obj.num3);(num3 is declared as default in Main_Access_controls so can't be accessed)
    }
}
