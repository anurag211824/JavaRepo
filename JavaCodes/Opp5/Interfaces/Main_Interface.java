package JavaCodes.Opp5.Interfaces;

public class Main_Interface {

    public static void main(String[] args) {
      Son s1=new Son("Anmol");
      System.out.println("Son name is "+s1.name);
      s1.eyes();
      s1.height();
      s1.nose();
      s1.SkinTone();
      System.out.println();

      Daughter d1=new Daughter("Aditi");
        System.out.println("Daughter name is "+d1.name);
        d1.eyes();
        d1.height();
        d1.nose();
        d1.SkinTone();

    }
}
