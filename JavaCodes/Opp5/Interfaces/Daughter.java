package JavaCodes.Opp5.Interfaces;

public class Daughter implements Father,Mother{

    String name;
    public Daughter(String name){
        this.name=name;
    }
    @Override
    public void eyes() {
        System.out.println("She has eyes like her father");
    }

    @Override
    public void nose() {
        System.out.println("She has nose like her mother");
    }

    @Override
    public void height() {
        System.out.println("She has height like her mother");
    }

    @Override
    public void SkinTone() {
        System.out.println("she has SkinTone like her father");
    }
}
