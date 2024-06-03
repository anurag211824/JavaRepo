package JavaCodes.Opp5.Abstract_classes;

public class Main_Abstract_class {
    public static void main(String[] args) {
      Son s1=new Son(30);
      Daughter d1=new Daughter(28);
      Parent p1=new Parent();
      s1.career();
      s1.partner();
      //s1.normal();
      System.out.println();
      d1.career();
      d1.partner();
      //d1.normal();

    }
}
