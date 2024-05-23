package JavaCodes.Opp3.Inheritance;

public class Mobile_phones {

   // parent class
    int price;
    int total_Ram;
    int cameraPixels;
    int batteryMah;
    //int total_rom;

    public Mobile_phones(){
        //super();
        //Class Object is the root of the class hierarchy.
        // Every class has Object as a superclass. All objects, including
        // arrays, implement the methods of this class.
        this.price=0;
        this.total_Ram=0;
        this.cameraPixels=0;
        this.batteryMah=0;
    }
    public Mobile_phones(Mobile_phones other){
        this.price=other.price;
        this.total_Ram= other.total_Ram;
        this.cameraPixels= other.cameraPixels;
        this.batteryMah= other.batteryMah;
    }
    public Mobile_phones(int price,int total_Ram,int cameraPixels,int batteryMah){
        this.price=price;
        this.total_Ram=total_Ram;
        this.cameraPixels=cameraPixels;
        this.batteryMah=batteryMah;
    }
}
