package JavaCodes.Opp3.Inheritance;

//Multilevel inheritance
public class Redmi_poco extends Redmi {
    int poco_series;

    public Redmi_poco(){
        super();
        this.poco_series=0;
    }
    public Redmi_poco(Redmi_poco other){
        super(other);
        this.poco_series=other.poco_series;
    }
    public Redmi_poco(int price,int total_Ram,int cameraPixels,int batteryMah,String name,int series,int poco_series){
        super(price,total_Ram,cameraPixels,batteryMah,name,series);
        this.poco_series=poco_series;
    }
}
