package JavaCodes.Opp5.Interfaces;

public class Son implements Father,Mother{
    String name;

    public Son(String name){
        this.name=name;
    }
    @Override
    public void eyes() {
        System.out.println("He has eyes like his mother");
    }

    @Override
    public void nose() {
        System.out.println("He has nose like his mother");
    }

    @Override
    public void height() {
        System.out.println("He has height like his father");
    }

    @Override
    public void SkinTone() {
        System.out.println("He has SkinTone like his mother");
    }
}
