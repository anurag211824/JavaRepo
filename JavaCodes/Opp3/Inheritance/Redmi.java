package JavaCodes.Opp3.Inheritance;

//single inheritance
public class Redmi extends Mobile_phones {
    //Child class
     String name;
     int series;
     //int total_rom;

    //Parametrised constructor
     public Redmi(int price,int total_Ram,int cameraPixels,int batteryMah,String name,int series){
         super(price,total_Ram,cameraPixels,batteryMah);//call the parent class constructor
         this.name=name;
         this.series=series;
         //System.out.println(super.total_rom); super here isn used if Mobile phone and Redmi class
         //same variable total_ram
     }
   //default constructor
    public Redmi() {
        this.name="null";
        this.series=0;
    }
    //copy constructor
    public Redmi(Redmi other){
         this.name= other.name;
         this.series= other.series;
    }
}
