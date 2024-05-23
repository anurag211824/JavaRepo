package JavaCodes.Opp4.Access_contols;

public class Demo1 {
    public static void main(String[] args) {
        Main_Access_controls obj=new Main_Access_controls();
        //obj.num1;(num1 is declared as private in Main_Access_controls so can't be accessed)
        obj.num2=6;
        System.out.println(obj.num2);//(num2 is declared as protected in Main_Access_controls so can be accessed)
        obj.num3=78;
        System.out.println(obj.num3);//(num3 is declared as default in Main_Access_controls so can be accessed)
    }
}
