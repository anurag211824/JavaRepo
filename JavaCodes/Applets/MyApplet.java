package JavaCodes.Applets;
import java.awt.*;

import java.applet.Applet;

public class MyApplet extends Applet {

  Label l1,l2;
  TextField t1,t2;
  Button b1;
  public void init(){
    l1=new Label("First Number");
    l2=new Label("Second Number");
    t1=new TextField(getName());
    t2=new TextField();
    b1=new Button();
    setLayout(null);
    l1.setBounds(30,50,100,20);
    l2.setBounds(30,100,100,20);0
    add(l1);
    add(l2);
    add(t1);
    add(t2);
    add(b1);
  }










    // public void paint(Graphics g){
    //    g.drawString("Anurag kumar", 100, 100);
    // }
}
