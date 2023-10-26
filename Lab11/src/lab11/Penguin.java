package lab11;

public class Penguin extends Bird implements EggLayer{

    public Penguin(){
        this.setSpecies("Penguin");
        this.setCanFly(false);
        this.setCanSwim(true);
    }

    public String makeNoise(){
        return "honk!";
    }

    public String layEgg(){
        return "The " +this.getSpecies() + " has laid an egg!";
    }
}
