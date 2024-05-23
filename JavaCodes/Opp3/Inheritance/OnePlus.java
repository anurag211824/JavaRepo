package JavaCodes.Opp3.Inheritance;

//hierarchical inheritance
public class OnePlus extends Mobile_phones {
    //child class
    String name;
    int series;
    public OnePlus(int price,int total_Ram,int cameraPixels,int batteryMah,String name,int series){
        super(price,total_Ram,cameraPixels,batteryMah);//call the parent class constructor
        this.name=name;
        this.series=series;
    }
}
