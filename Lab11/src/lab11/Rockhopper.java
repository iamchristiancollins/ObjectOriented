package lab11;

public class Rockhopper extends Penguin{

    public Rockhopper(){
        this.setSpecies("Rockhopper");
        this.setCanSwim(true);
        this.setCanFly(false);
    }

    public String showOffEyebrows(){
        return "The rockhopper's eyebrows are glorious.";
    }
}
